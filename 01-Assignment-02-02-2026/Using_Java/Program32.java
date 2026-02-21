/*
Program 32
Java program to print Fibonacci series using iteration
*/

import java.util.Scanner;

public class Program32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Invalid input");
        } else {
            int a = 0, b = 1;

            for (int i = 0; i < num; i++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
        }
        scanner.close();
    }
}