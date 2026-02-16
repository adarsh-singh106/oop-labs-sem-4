/*
Program 9
Java program to find the average of 5 numbers using while loop
*/

import java.util.Arrays;

public class Program9 {

    public static void main(String[] args) {
        double[] numbers = {1,6,3.6,8,9};

        System.out.println("The Numbers are " + Arrays.toString(numbers));

        int i = 0 ;
        double sum = 0;
        while (i < 5) {
            sum += numbers[i];
            i++;
        }
        System.out.println("Average of Above No. is " + ( sum / 5.0));
        
    }

}
