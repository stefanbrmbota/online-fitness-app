package app.model;

import java.time.LocalDateTime;

public class Message {

    private int id;
    private User sender;
    private User receiver;
    private String content;
    private LocalDateTime sentTime;


    public Message() {
    }


    public Message(int id, User sender, User receiver, String content, LocalDateTime sentTime) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.sentTime = sentTime;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getSentTime() {
        return sentTime;
    }

    public void setSentTime(LocalDateTime sentTime) {
        this.sentTime = sentTime;
    }
}
