/* Write a Java program that accepts three integers from the user and 
return true if two or more of them (integers) have the same rightmost digit. 
The integers are non- negative */

import java.util.Scanner;

public class Practical_03 {
    public static boolean solution(int num1, int num2, int num3) {
        int N1 = num1 % 10, N2 = num2 % 10, N3 = num3 % 10;
        if ((N1 == N2) || (N2 == N3) || (N1 == N3))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter First Number : ");
        num1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        num2 = sc.nextInt();
        System.out.print("Enter Third Number : ");
        num3 = sc.nextInt();
        sc.close();
        System.out.println(solution(num1, num2, num3));
    }
}
