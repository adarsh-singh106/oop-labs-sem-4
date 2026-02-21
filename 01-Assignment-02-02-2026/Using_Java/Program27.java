/*
Program 27
Java program to check whether a string is palindrome or not
*/

import java.util.Scanner;

public class Program27 {

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // normalize input
        input = input.toLowerCase().replaceAll("\\s+", "");

        if (isPalindrome(input)) {
            System.out.println("It is a Palindrome string!");
        } else {
            System.out.println("It is not a Palindrome string!");
        }

        scanner.close();
    }
}