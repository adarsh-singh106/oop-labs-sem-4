/*
Program 18
Java program to print the numbers from n till 0 using recursion
*/

import java.util.Scanner;

public class Program18 {
    public static int printNumber(int n){
        if (n <  0)
            return 0;
        System.out.println(n);
        return printNumber(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a Positive Integer number : ");
        int Num = scanner.nextInt();
        scanner.close();
        printNumber(Num);

    }

}
