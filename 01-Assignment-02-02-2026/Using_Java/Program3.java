/*
Program 3
Java program to find the area of a triangle whose three sides are given
*/

import java.util.Scanner;

public class Program3 {
    /* Solution ->
    When lenght of each side of triange is given the Area(A)
    A = sqrt(s*(s-a)*(s-b)*(s-c))
    where , s is semi-perimeter 
    s = (a+b+c) / 2 */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, s, Area;

        System.out.print("Enter the Length a : ");
        a = scanner.nextDouble(); 
        
        System.out.print("Enter the Length b : ");
        b = scanner.nextDouble(); 
        
        System.out.print("Enter the Length c : ");
        c = scanner.nextDouble(); 

        s = (a + b + c) / 2.0; 
        
        Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        System.out.println("Area of Triangle : " + Area);
        scanner.close();
    }
}





