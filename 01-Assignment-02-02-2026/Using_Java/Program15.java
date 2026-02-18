/*
Program 15
Java program to check whether the given integer is a prime number or not
*/

import java.util.Scanner;

public class Program15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer Number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number < 2) {
            isPrime = false;
        } else {
            int limit = (int) Math.sqrt(number);
            for (int i = 2; i <= limit; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        scanner.close();
    }
}
