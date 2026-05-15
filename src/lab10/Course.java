package lab10;

public class Course {

    private String code;
    private String title;
    private int credits;
    private int capacity;
    private int enrolled;

    public Course(String code, String title, int credits, int capacity) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.capacity = capacity;
        this.enrolled = 0;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public int getCredits() {
        return credits;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getEnrolled() {
        return enrolled;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isAvailable() {
        return enrolled < capacity;
    }

    public void incrementEnrolled() {
        enrolled++;
    }

    public void decrementEnrolled() {
        enrolled--;
    }

    public String toString() {
        return code + " - " + title + " (" + credits + " cr) [" + enrolled + "/" + capacity + " enrolled]";
    }
}