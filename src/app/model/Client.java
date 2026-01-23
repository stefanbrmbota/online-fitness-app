package app.model;

import java.util.Date;

public class Client extends User {

    private double height;
    private double weight;
    private Date dateOfBirth;
    private String healthStatus;
    private String gender;
    private ExerciseType exerciseType;



    public Client() {
        this.role = Role.CLIENT;
    }


    public Client(double height, double weight, Date dateOfBirth, String healthStatus, String gender, ExerciseType exerciseType) {
        this.role = Role.CLIENT;
        this.height = height;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
        this.healthStatus = healthStatus;
        this.gender = gender;
        this.exerciseType = exerciseType;
    }


    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHealthStatus() {
        return healthStatus;
    }
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public ExerciseType getExerciseType() {
        return exerciseType;
    }
    public void setExerciseType(ExerciseType exerciseType) {
        this.exerciseType = exerciseType;
    }
}
