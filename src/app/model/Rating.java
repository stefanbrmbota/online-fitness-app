package app.model;

public class Rating {
    private Long id;
    private int value; // Must be 1-5
    private String comment;
    private Client author;
    private RatingType type; // Enum: COACH, WORKOUT, or EXERCISE
    private Long targetId; // ID of the specific Coach, Workout, or Exercise being rated

    public Rating() {
    }

    public Rating(Long id, int value, String comment, Client author, RatingType type, Long targetId) {
        this.id = id;
        setValue(value);
        this.comment = comment;
        this.author = author;
        this.type = type;
        this.targetId = targetId;
    }

    public void setValue(int value) {
        if (value < 1 || value > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5");
        }
        this.value = value;
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getValue() { return value; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }

    public Client getAuthor() { return author; }
    public void setAuthor(Client author) { this.author = author; }

    public RatingType getType() { return type; }
    public void setType(RatingType type) { this.type = type; }

    public Long getTargetId() { return targetId; }
    public void setTargetId(Long targetId) { this.targetId = targetId; }
}