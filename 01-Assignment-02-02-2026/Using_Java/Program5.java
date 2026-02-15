/*
Program 5
Java program to find the product of a set of real numbers
*/

import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {
        // setup scanner
        Scanner scanner = new Scanner(System.in);

        // get size
        System.out.print("Enter the number of real numbers : ");
        int size = scanner.nextInt();

        // define product variable
        double product = 1 ;

        for(int i = 0;i < size; i++){
            System.out.println("Enter the no. " + (i + 1) + " :");
            double num = scanner.nextDouble();
            product *=num;
        }

        // show result
        System.out.println("Product of given real numbers is : " + product);

        scanner.close();
    }

}
