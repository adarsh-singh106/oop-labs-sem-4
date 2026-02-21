/*
Program 33
Java program to implement a calculator for basic operations
*/

import java.util.Scanner;

public class Program33 {

    public static void main(String[] args) {
        System.out.println("Welcome to Mini Calculator");
        Scanner sc = new Scanner(System.in);
        calculator cal = new calculator();
        while (true) {
            System.out.print(
                    "Choose form these...\n1->adddition\n2->subtraction\n3->division\n4->multiplication\n5->modulus\n6->exit\nchoice ? : ");
            int choice = sc.nextInt();

            if (choice == 6) {
                System.out.println("Bye");
                break;
            } else {
                System.out.print("Enter number a : ");
                double a = sc.nextDouble();
                System.out.print("Enter number b : ");
                double b = sc.nextDouble();
                if (choice == 1) {
                    System.out.println("Result : " + cal.addition(a, b));
                } else if (choice == 2) {
                    System.out.println("Result : " + cal.subtraction(a, b));
                } else if (choice == 3) {
                    System.out.println("Result : " + cal.division(a, b));
                } else if (choice == 4) {
                    System.out.println("Result : " + cal.multiplication(a, b));
                } else if (choice == 5) {
                    System.out.println("Result : " + cal.modulus(a, b));
                } else {
                    System.out.println("Invalid Choice");
                }
            }
        }
        sc.close();
    }

}

class calculator {

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double division(double a, double b) {
        if (b == 0)
            throw new RuntimeException("Denominator cant be zero");
        return a / b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double modulus(double a, double b) {
        return a % b;
    }
}
