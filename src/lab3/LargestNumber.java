package lab3;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            int num = input.nextInt();

            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Largest number is: " + largest);
    }
}
