package app.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Workout {

    private int id;
    private String name;
    private List<WorkoutItem> items = new ArrayList<>();
    private LocalDate executionDate;



    public Workout() {
    }


    public Workout(int id, String name, LocalDate executionDate) {
        this.id = id;
        this.name = name;
        this.executionDate = executionDate;

    }

    // Method to add a WorkoutItem
    public void addItem(WorkoutItem item) {
        items.add(item);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WorkoutItem> getItems() {
        return items;
    }

    public void setItems(List<WorkoutItem> items) {
        this.items = items;
    }

    public LocalDate getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(LocalDate executionDate) {
        this.executionDate = executionDate;
    }


}
