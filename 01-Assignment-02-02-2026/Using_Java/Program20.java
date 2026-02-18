/*
Program 20
Java program to display the sum of n numbers using an array
*/

import java.util.Arrays;
import java.util.Scanner;

public class Program20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Length of the Array : ");
        int size = scanner.nextInt();
        

        double[] array = new double[size];

        for(int i =0;i < size ;i++){
            System.out.print("Enter Element No." + (i+1) + " : ");
            array[i] = scanner.nextDouble();

        }
        scanner.close();

        double sum = 0.0 ;
        for (double i : array) {
            sum+=i;
        }


        System.out.println("Your Array => " + Arrays.toString(array));
        System.out.println("Sum of Items => " + sum);

    }

}
