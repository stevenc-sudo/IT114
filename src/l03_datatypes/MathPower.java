package l03_datatypes;

import java.util.Scanner;

    public class MathPower {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double x, y, ans;
            System.out.printf("Enter x: ");
            x = input.nextDouble();
            System.out.printf("Enter y: ");
            y = input.nextDouble();

            ans = Math.pow(x, y);

            System.out.printf("%.2f ^ %.2f = %.2f%n", x, y, ans);



        }
    }
