/*
Program 12
Java program to find the sum of the digits of an integer using while loop
*/

import java.util.Scanner;

public class Program12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer : ");
        int number = scanner.nextInt();

        // System.out.println("Original Number : " + number);
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits : " + sum);
        scanner.close();
    }

}
