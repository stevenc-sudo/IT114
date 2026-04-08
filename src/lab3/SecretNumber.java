package lab3;

import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secret = 7;
        int guess = 0;

        while (guess != secret) {
            System.out.print("Guess the number: ");
            guess = input.nextInt();

            if (guess < secret) {
                System.out.println("Too low");
            } else if (guess > secret) {
                System.out.println("Too high");
            } else {
                System.out.println("Correct!");
            }
        }
    }
}
