/*
Program 35
Java program to find the sum of even numbers
*/

import java.util.Scanner;

public class Program35 {

    public static boolean isEven(int n){
        return n%2 == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = scanner.nextInt() , sum = 0;

        for(int i = 0;i <= num;i++){
            if (isEven(i))
                sum+=i;

        }
        System.out.println("Sum of all even numbers upto " + num + " is " + sum);
        scanner.close();
    }

}
