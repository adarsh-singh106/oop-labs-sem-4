/*
Program 4
Java program to find the average of a set of integers
*/

import java.util.Arrays;
import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {
        /*
        Lets take the size of the array and the ask user to fill and we will return its sum */

        // 0. set up a scnner 
        Scanner scanner = new Scanner(System.in);

        // 1. get the size 
        System.out.print("Enter the size of your array : ");
        int size = scanner.nextInt();

        // 2. declare array with that size
        int[] nums = new int[size];
        int sum = 0;

        // 3. filling the nums array 
        for(int i = 0; i<size;i++){
            System.out.print("Enter the " + (i+1)+ " Integer : ");
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }

        // 4. Show the result 
        System.out.println("Your Array : " + Arrays.toString(nums));
        System.out.println("Sum of the items in array is : " + sum);

        // close the scanner 
        scanner.close();

        
    }

}
