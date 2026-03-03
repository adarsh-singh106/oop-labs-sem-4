/* Write a Java program to convert time in seconds to hours, minutes and 
seconds and display the output in format HH:MM:SS  */

import java.util.Scanner;

public class Practical_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int totalSeconds = sc.nextInt();
        sc.close();

        System.out.println("Result: " + convert(totalSeconds));
    }

    public static String convert(int totalSeconds) {
        if (totalSeconds < 0) {
            throw new IllegalArgumentException("Time cannot be negative");
        }

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}