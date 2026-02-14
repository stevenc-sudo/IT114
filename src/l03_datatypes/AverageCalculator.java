package l03_datatypes;

import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c;
        double average;

        System.out.print("Enter three integers: ");

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        average = (a + b + c) / 3.0;

        System.out.printf("The average is %f%n", average);
    }
}
