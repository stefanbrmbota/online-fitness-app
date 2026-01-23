package app.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WorkoutPlan {

    private int id;
    private Trainer trainer;
    private Client client;
    private LocalDate creationDate;
    private List<Workout> workouts = new ArrayList<>();

    public WorkoutPlan() {
    }


    // Constructor
    public WorkoutPlan(Trainer trainer, Client client) {
        this.trainer = trainer;
        this.client = client;
        this.creationDate = LocalDate.now();
    }

    // Method to add a Workout
    public void addWorkout(Workout workout) {
        workouts.add(workout);
    }

    // Getters
    public List<Workout> getWorkouts() {
        return workouts;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public Client getClient() {
        return client;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    // Optional setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
