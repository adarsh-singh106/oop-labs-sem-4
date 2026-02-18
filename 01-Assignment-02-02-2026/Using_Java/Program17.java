/*
Program 17
Java program to find the roots of a quadratic equation
*/

import java.util.Scanner;

public class Program17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quadratic Equation : aX^2 + bX + c = 0");
        System.out.print("a ? => ");
        double a = scanner.nextDouble();
        System.out.print("b ? => ");
        double b = scanner.nextDouble();
        System.out.print("c ? => ");
        double c = scanner.nextDouble();
        scanner.close();
        double d = Math.pow(b, 2) - (4 * a * c);
        if (d > 0) {
            System.out.println("2 real solutons exist");
            double x1 = (-b + (Math.sqrt(d))) / (2 * a);
            double x2 = (-b - (Math.sqrt(d))) / (2 * a);
            System.out.println("Roots -> " + x1 + ' ' + x2);
        } else if (d == 0) {
            double x1 = (-b + (Math.sqrt(d))) / (2 * a);
            double x2 = (-b - (Math.sqrt(d))) / (2 * a);
            System.out.println("1 real solution exist");
            System.out.println("Roots -> " + x1 + ' ' + x2);
        } else {
            System.out.println("0 real soultion exist");
        }

    }

}
