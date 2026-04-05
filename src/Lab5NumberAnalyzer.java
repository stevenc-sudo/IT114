import java.util.Scanner;

public class Lab5NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        System.out.println("Is Even: " + isEven(num));
        System.out.println("Is Prime: " + isPrime(num));
        System.out.println("Factorial: " + getFactorial(num));
        System.out.println("Sum of Digits: " + sumOfDigits(num));
        System.out.println("Reversed Number: " + reverseNumber(num));

        scn.close();
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static int getFactorial(int num) {
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        num = Math.abs(num);

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        int sign = 1;

        if (num < 0) {
            sign = -1;
            num = Math.abs(num);
        }

        while (num != 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }

        return reversed * sign;
    }
}