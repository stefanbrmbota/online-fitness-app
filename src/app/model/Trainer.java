package app.model;

public class Trainer extends User {

    private String biography;
    private String specialty;
    private double averageRating;
    private String qualifications;


    public Trainer() {
        this.role = Role.TRAINER;
    }

    public Trainer(int id, String username, String password,
                   String firstName, String lastName,
                   String email) {
        super(id, username, password, firstName, lastName, email, Role.TRAINER);
    }

    public Trainer(int id,
                   String username,
                   String password,
                   String firstName,
                   String lastName,
                   String email,
                   String biography,
                   String specialty,
                   double averageRating,
                   String qualifications) {

        super(id, username, password, firstName, lastName, email, Role.TRAINER);
        this.biography = biography;
        this.specialty = specialty;
        this.averageRating = averageRating;
        this.qualifications = qualifications;
    }



    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
}
