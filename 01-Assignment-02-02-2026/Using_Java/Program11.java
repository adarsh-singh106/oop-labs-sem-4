/*
Program 11
Java program to find the geometric mean of n numbers
*/

import java.util.Scanner;

public class Program11 {

    public static void main(String[] args) {
        // GP = geometric mean => if a,b,c are in GP
        // then 3rd root of (a*b*c) is GM

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of values: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Size must be greater than 0.");
            scanner.close();
            return;
        }

        double product = 1;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            double num = scanner.nextDouble();
            product *= num;
        }

        double geometricMean = Math.pow(product, 1.0 / size);

        System.out.println("Geometric Mean = " + geometricMean);

        scanner.close();
    }
}

