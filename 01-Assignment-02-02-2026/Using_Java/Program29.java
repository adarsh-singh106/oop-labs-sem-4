/*
Program 29
Java program to implement matrix multiplication
*/

import java.util.Arrays;
import java.util.Scanner;

public class Program29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // size of matrix - 1
        System.out.print("Enter rows of Matrix - 1 : ");
        int n1 = scanner.nextInt();
        System.out.print("Enter columns of Matrix - 1 : ");
        int n2 = scanner.nextInt();

        // size of matrix - 2
        System.out.print("Enter rows of Matrix - 2 : ");
        int m1 = scanner.nextInt();
        System.out.print("Enter columns of Matrix - 2 : ");
        int m2 = scanner.nextInt();

        // check size validity
        if (n2 != m1) {
            System.out.println("Matrix multiplication requires n x m & m x p situation ");
            scanner.close();
            return;
        }

        double[][] matrix1 = new double[n1][n2];
        double[][] matrix2 = new double[m1][m2];

        // input matrix 1
        for (int r = 0; r < n1; r++) {
            for (int c = 0; c < n2; c++) {
                System.out.print("Enter Matrix-1 (" + (r + 1) + "," + (c + 1) + ") : ");
                matrix1[r][c] = scanner.nextDouble();
            }
        }

        // input matrix 2
        for (int r = 0; r < m1; r++) {
            for (int c = 0; c < m2; c++) {
                System.out.print("Enter Matrix-2 (" + (r + 1) + "," + (c + 1) + ") : ");
                matrix2[r][c] = scanner.nextDouble();
            }
        }

        // matrix subraction
        double[][] result = new double[n1][m2];
        for (int r = 0; r < n1; r++) {
            for (int c = 0; c < m2; c++) {
                int sum = 0;
                for(int k = 0; k < n2;k++){
                    sum += (matrix1[r][k] * matrix2[k][c]);
                }
                result[r][c] = sum;
            }
        }

        System.out.println("\nMatrix - 1 : " + Arrays.deepToString(matrix1));
        System.out.println("Matrix - 2 : " + Arrays.deepToString(matrix2));
        System.out.println("Resultant Matrix : " + Arrays.deepToString(result));

        scanner.close();
    }

}
