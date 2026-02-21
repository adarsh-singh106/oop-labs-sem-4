/*
Program 30
Java program to check leap year
*/

import java.util.Scanner;

public class Program30 {

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a valid year: ");
        int year = scanner.nextInt();

        if (year <= 0) {
            System.out.println("Invalid year");
        } else {
            if (isLeap(year)) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        }

        scanner.close();
    }
}