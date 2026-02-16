/*
Program 10
Java program to display the given integer in reverse manner
*/

import java.util.Scanner;

public class Program10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        int reverse = 0;
        int num = Math.abs(number);

        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        if (number < 0) {
            reverse = -reverse;
        }

        System.out.println("Original number : " + number);
        System.out.println("Reversed number : " + reverse);

        scanner.close();
    }
}
