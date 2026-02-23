package practice;

import java.util.Scanner;
public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("what is your gpa");
        double gpa = scanner.nextDouble();

        /* This did not work because it expects true or false.
        If I want y/n I would have to add another line

        System.out.println("Are you a student? (y/n): ");
        boolean isStudent = scanner.nextBoolean(); */

        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);
        if(isStudent){
            System.out.println("You're gonna be smart one day!");
        }
        else{
            System.out.println("You better get your butt in gear!");
        }

        scanner.close();

    }
}
