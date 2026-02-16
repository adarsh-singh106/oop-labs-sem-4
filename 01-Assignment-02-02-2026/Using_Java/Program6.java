/*
Program 6
Java program to find the circumference and area of a circle with a given radius
*/

import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of circle : ");
        double radius = scanner.nextDouble();

        double circumference = 2 * 3.14 * radius;
        double area = 3.14 * radius * radius ;

        System.out.println("Circumference : " + circumference);
        System.out.println("Area : " + area);

        scanner.close();
    }

}
