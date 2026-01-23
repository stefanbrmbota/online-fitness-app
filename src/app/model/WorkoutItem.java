package app.model;

import java.time.Duration;

public class WorkoutItem {

    private Exercise exercise;
    private int sets;
    private int repetitions;
    private Duration duration; // duration of the exercise


    public WorkoutItem(Exercise exercise, int sets, int repetitions, Duration duration) {
        this.exercise = exercise;
        this.sets = sets;
        this.repetitions = repetitions;
        this.duration = duration;
    }


    public Exercise getExercise() {
        return exercise;
    }

    public int getSets() {
        return sets;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public Duration getDuration() {
        return duration;
    }

    // Setters (optional)
    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
