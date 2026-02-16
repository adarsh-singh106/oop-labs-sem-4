/*
Program 8
Java program to check whether the given integer is a multiple of both 5 and 7
*/

import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 7 == 0){
            System.out.println("Yes " + number + " is multiple of 5 & 7.");
        }
        else{
            System.out.println("No " + number + " is not a multiple of 5 & 7.");

        }

        scanner.close();
    }

}
