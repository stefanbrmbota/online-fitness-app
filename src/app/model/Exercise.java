package app.model;

public class Exercise {

    private int id;
    private String name;
    private String description;
    private String video; // can be URL or file path
    private String equipment;


    public Exercise() {
    }


    public Exercise(int id, String name, String description, String video, String equipment) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.video = video;
        this.equipment = equipment;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getVideo() {
        return video;
    }

    public String getEquipment() {
        return equipment;
    }

    // Setters (optional, if you need to update fields)
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }
}
