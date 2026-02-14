package l03_datatypes;

import java.util.Scanner;

public class DecimalRounder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");
        double value = input.nextDouble();

        System.out.printf("Rounded: %.3f%n", value);
    }
}
