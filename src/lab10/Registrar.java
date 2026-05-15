package lab10;

import java.util.ArrayList;

public class Registrar {

    private ArrayList<Course> courses;
    private ArrayList<Student> students;

    public Registrar() {
        courses = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Course findCourse(String code) {

        for (Course c : courses) {
            if (c.getCode().equals(code)) {
                return c;
            }
        }

        return null;
    }

    public void register(Student student, Course course) {

        student.enroll(course);
        course.incrementEnrolled();
    }

    public void printRoster(String code) {

        Course course = findCourse(code);

        if (course == null) {
            System.out.println("Course not found.");
            return;
        }

        System.out.println(course);

        for (Student s : students) {

            for (Course c : s.getCourses()) {

                if (c.getCode().equals(code)) {
                    System.out.println(s.getName() +
                            " (" + s.getStudentId() + ")");
                }
            }
        }
    }
}