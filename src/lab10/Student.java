package lab10;

import java.util.ArrayList;

public class Student {

    private String name;
    private String studentId;
    private double gpa;
    private ArrayList<Course> courses;

    public Student(String name, String studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void enroll(Course course) {

        for (Course c : courses) {
            if (c.getCode().equals(course.getCode())) {
                throw new IllegalStateException("Already enrolled in " + course.getCode());
            }
        }

        if (!course.isAvailable()) {
            throw new IllegalArgumentException(course.getCode() + " is full.");
        }

        courses.add(course);
    }

    public void drop(String courseCode) {

        boolean removed = courses.removeIf(c ->
                c.getCode().equals(courseCode));

        if (!removed) {
            throw new IllegalArgumentException("Course not found.");
        }
    }

    public int getTotalCredits() {

        int total = 0;

        for (Course c : courses) {
            total += c.getCredits();
        }

        return total;
    }

    public String toString() {
        return "Student: " + name +
                " (ID: " + studentId + ")" +
                " | GPA: " + gpa +
                " | Credits: " + getTotalCredits();
    }
}