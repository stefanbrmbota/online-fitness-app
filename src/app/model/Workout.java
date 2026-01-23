package app.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Workout {

    private int id;
    private String name;
    private List<WorkoutItem> items = new ArrayList<>();
    private Date executionDate;
    private int rating;
    private String comment;


    public Workout() {
    }


    public Workout(int id, String name, Date executionDate, int rating, String comment) {
        this.id = id;
        this.name = name;
        this.executionDate = executionDate;
        this.rating = rating;
        this.comment = comment;
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

    public Date getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(Date executionDate) {
        this.executionDate = executionDate;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
