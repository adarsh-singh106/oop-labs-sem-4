/*
Program 31
Java program to find the Nth term in Fibonacci series using recursion
*/

import java.util.Scanner;

public class Program31 {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to get its Fibonacci value: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Fibonacci is only defined for positive natural numbers.");
        } else {
            System.out.println("Fibonacci value of " + num + " is: " + fibonacci(num));
        }

        scanner.close();
    }
}
