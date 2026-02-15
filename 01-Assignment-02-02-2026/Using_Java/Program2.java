/*
Program 2
Java program to convert temperature from Celsius to Fahrenheit
*/

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Temperature in Degree Celsius  : ");
        double C = scanner.nextDouble();

        double F = 1.8 * C + 32;
        System.out.println(C + " Degree Celsius is " + F + " Fahrenheit");

        scanner.close();
    }

}
