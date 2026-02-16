/*
Program 7
Java program to check whether the given integer is a multiple of 5
*/

import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        if (number % 5 == 0){
            System.out.println("Yes " + number + " is multiple of 5.");
        }
        else{
            System.out.println("No " + number + " is not a multiple of 5.");

        }

        scanner.close();
    }

}
