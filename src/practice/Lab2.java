package practice;

import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Full name: ");
        String fullName = scn.nextLine();

        System.out.println("Account number: ");
        String acctNum = scn.nextLine();

        System.out.println("Initial balance: ");
        double inBal = scn.nextDouble();

        String trimmedName = fullName.trim();
        String upperName = trimmedName.toUpperCase();

        int spaceIndex = trimmedName.indexOf(" ");
        String firstName = trimmedName.substring(0, spaceIndex);

        String noSpaces = trimmedName.replace(" ","");
        int charCount = noSpaces.length();

        if (acctNum.length() != 8) {
            System.out.println("Invalid Account number");
        }

        if (acctNum.charAt(0) != '1') {
            System.out.println("Invalid Account number");
        }

        for (int i = 0; i < acctNum.length(); i++) {
            if (!Character.isDigit(acctNum.charAt(i))) {
                System.out.println("Invalid Account number");
            }
        }

        System.out.println("Deposit amount: ");
        double deposit = scn.nextDouble();
        inBal = inBal + deposit;

        System.out.println("Withdrawal amount: ");
        double withdraw = scn.nextDouble();
        inBal = inBal - withdraw;

        System.out.println("Create a 4-digit PIN: ");
        String pin = scn.next();

        if (pin.length() != 4) {
            System.out.println("Invalid PIN");
        }

        System.out.println("Re-enter PIN: ");
        String loginPin = scn.next();

        if (pin.equals(loginPin)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Incorrect Pin");
        }

        System.out.println("ACCOUNT SUMMARY ---------------");
        System.out.println("Name: " + upperName);
        System.out.println("Account Number: " + acctNum);
        System.out.println("Final Balance: $" + inBal);

        }

}
