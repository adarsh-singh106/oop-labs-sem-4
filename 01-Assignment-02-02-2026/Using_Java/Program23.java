/*
Program 23
Java program to find the number of odd numbers in an array
*/

import java.util.Arrays;
import java.util.Scanner;

public class Program23 {
    public static boolean isOdd(double n) {
        if (n % 2 != 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = scanner.nextInt();

        double[] array = new double[size];

        System.out.println("Lets Fill the Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter No." + (i + 1) + " : ");
            array[i] = scanner.nextDouble();
        }
        scanner.close();
        System.out.println("Now let's Count,How many are odd ! " + Arrays.toString(array));
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (isOdd(array[i]))
                count++;
        }
        System.out.println("So Total Odd Number in Your Array is -> " + count);
    }

}
