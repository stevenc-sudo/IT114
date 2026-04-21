package practice;

public class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student("Spongebob", 30, 4.0);
        Student student2 = new Student("kirk", 36, 3.2);

        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(student1.age);
        System.out.println(student2.age);
        System.out.println(student1.gpa);
        System.out.println(student2.gpa);
        System.out.println(student1.isEnrolled);
        System.out.println(student2.isEnrolled);


    }


}
