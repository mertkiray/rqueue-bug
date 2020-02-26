package test.rqueue.demo;

public class JobX {
    private String message;
    private String id;

    public JobX() {

    }

    public JobX(String message, String id) {
        this.message = message;
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "JobX(" +
                "message=" + message+
                ", id=" + id+
                ')';
    }
}
