/*
Program 16
Java program to generate the prime numbers from 1 to N
*/

import java.util.Scanner;

public class Program16 {

    public static boolean isPrime(int n) {
        if (n < 2) return false;

        int limit = (int) Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer Number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (num < 2) {
            System.out.println("There are no prime numbers less than 2.");
        } else {
            for (int i = 2; i <= num; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
    }
}
