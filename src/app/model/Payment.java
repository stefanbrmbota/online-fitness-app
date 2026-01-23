package app.model;

public class Payment {

    public enum Status {
        PENDING,
        COMPLETED,
        FAILED
    }

    private int id;
    private Client client;
    private double amount;
    private String period; // e.g., "January 2026" or "Monthly"
    private Status status;


    public Payment() {
    }


    public Payment(int id, Client client, double amount, String period, Status status) {
        this.id = id;
        this.client = client;
        this.amount = amount;
        this.period = period;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
