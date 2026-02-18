/*
Program 19
Java program to find the factorial of a number using recursion
*/

import java.util.Scanner;

public class Program19 {
    public static int factorial(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter a Postive integer : ");
        int number = scanner.nextInt();

        System.out.println(number + "! => " + factorial(number));
        scanner.close();
    }

}
