import java.util.Scanner;

public class Lab4Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Calculator Started Up");

        while (true) {
            System.out.print("Enter first number: ");
            double num1 = scn.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scn.nextDouble();

            System.out.print("Enter operation (+, -, *, /, ^): ");
            char op = scn.next().charAt(0);

            if (op == '+') {
                System.out.println("Result: " + add(num1, num2));
            } else if (op == '-') {
                System.out.println("Result: " + subtract(num1, num2));
            } else if (op == '*') {
                System.out.println("Result: " + multiply(num1, num2));
            } else if (op == '/') {
                if (num2 == 0) {
                    System.out.println("Error: Division by zero!");
                } else {
                    System.out.println("Result: " + divide(num1, num2));
                }
            } else if (op == '^') {
                System.out.println("Result: " + power(num1, (int) num2));
            } else {
                System.out.println("Invalid operation");
            }

            System.out.print("Continue? (y/n): ");
            char again = scn.next().charAt(0);

            if (again == 'n') {
                break;
            }
        }

        scn.close();
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    static double power(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}