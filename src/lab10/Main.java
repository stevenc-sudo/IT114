package lab10;

public class Main {

    public static void main(String[] args) {

        Registrar registrar = new Registrar();

        Course c1 = new Course("CS101", "Intro to Programming", 3, 2);
        Course c2 = new Course("MATH201", "Calculus I", 3, 3);
        Course c3 = new Course("ENG102", "Technical Writing", 3, 3);

        registrar.addCourse(c1);
        registrar.addCourse(c2);
        registrar.addCourse(c3);

        Student s1 = new Student("Alice", "S001", 3.7);
        Student s2 = new Student("Bob", "S002", 3.2);
        Student s3 = new Student("Carol", "S003", 3.9);
        Student s4 = new Student("Dave", "S004", 2.8);

        registrar.addStudent(s1);
        registrar.addStudent(s2);
        registrar.addStudent(s3);
        registrar.addStudent(s4);

        registrar.register(s1, c1);
        registrar.register(s1, c2);
        registrar.register(s1, c3);

        registrar.register(s2, c1);

        try {
            registrar.register(s3, c1);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        s1.drop("ENG102");

        System.out.println(s1);

        registrar.printRoster("CS101");
    }
}