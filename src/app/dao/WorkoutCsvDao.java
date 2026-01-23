package app.dao;

import app.model.*;
import app.util.CsvUtil;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WorkoutCsvDao implements WorkoutDao {

    private static final String WORKOUT_FILE = "workouts.csv";
    private static final String ITEM_FILE = "workout_items.csv";

    private static final String WORKOUT_HEADER =
            "id,name,executionDate";

    private static final String ITEM_HEADER =
            "id,workoutId,exerciseId,sets,repetitions,durationSeconds";

    @Override
    public Workout findById(int id) {
        for (Workout w : findAll()) {
            if (w.getId() == id) {
                return w;
            }
        }
        return null;
    }

    @Override
    public List<Workout> findAll() {

        // 1) Load workouts
        List<String[]> workoutRows = CsvUtil.read(WORKOUT_FILE);
        List<Workout> workouts = new ArrayList<>();

        for (String[] r : workoutRows) {
            int id = Integer.parseInt(r[0]);
            String name = r[1];
            LocalDate executionDate = LocalDate.parse(r[2]);

            Workout w = new Workout(id, name, executionDate);
            workouts.add(w);
        }

        // 2) Load workout items
        List<String[]> itemRows = CsvUtil.read(ITEM_FILE);

        for (String[] r : itemRows) {
            int workoutId = Integer.parseInt(r[1]);
            int exerciseId = Integer.parseInt(r[2]);
            int sets = Integer.parseInt(r[3]);
            int reps = Integer.parseInt(r[4]);
            long durationSeconds = Long.parseLong(r[5]);

            Exercise exercise = new Exercise();
            exercise.setId(exerciseId);
            exercise.setName("Exercise " + exerciseId);

            WorkoutItem item = new WorkoutItem(
                    exercise,
                    sets,
                    reps,
                    Duration.ofSeconds(durationSeconds)
            );

            for (Workout w : workouts) {
                if (w.getId() == workoutId) {
                    w.addItem(item);
                    break;
                }
            }
        }

        return workouts;
    }

    @Override
    public void save(Workout workout) {
        List<Workout> workouts = findAll();
        workout.setId(generateNextId(workouts));
        workouts.add(workout);
        writeAll(workouts);
    }

    @Override
    public void update(Workout workout) {
        List<Workout> workouts = findAll();
        for (int i = 0; i < workouts.size(); i++) {
            if (workouts.get(i).getId() == workout.getId()) {
                workouts.set(i, workout);
                break;
            }
        }
        writeAll(workouts);
    }

    /* ---------------- PRIVATE HELPERS ---------------- */

    private void writeAll(List<Workout> workouts) {
        List<String> workoutLines = new ArrayList<>();
        List<String> itemLines = new ArrayList<>();

        int itemId = 1;

        for (Workout w : workouts) {
            workoutLines.add(
                    w.getId() + "," +
                            w.getName() + "," +
                            w.getExecutionDate().toString()
            );

            for (WorkoutItem item : w.getItems()) {
                itemLines.add(
                        itemId++ + "," +
                                w.getId() + "," +
                                item.getExercise().getId() + "," +
                                item.getSets() + "," +
                                item.getRepetitions() + "," +
                                item.getDuration().getSeconds()
                );
            }
        }

        CsvUtil.write(WORKOUT_FILE, WORKOUT_HEADER, workoutLines);
        CsvUtil.write(ITEM_FILE, ITEM_HEADER, itemLines);
    }

    private int generateNextId(List<Workout> workouts) {
        int max = 0;
        for (Workout w : workouts) {
            if (w.getId() > max) {
                max = w.getId();
            }
        }
        return max + 1;
    }
}
