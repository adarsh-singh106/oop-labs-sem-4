/*
Program 24
Java program to find the largest number in an array without using built-in functions
*/


import java.util.Scanner;

public class Program24 {
    public static double max(double[] nums,int size){
        double maxItem = -999999,currItem;
        for(int i = 0;i < size;i++){
            currItem = nums[i];
            if (currItem > maxItem)
                maxItem = currItem;
        }
        return maxItem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = scanner.nextInt();

        double[] array = new double[size];

        System.out.println("Lets Fill the Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter No." + (i + 1) + " : ");
            array[i] = scanner.nextDouble();
        }
        scanner.close();
        
        System.out.println("Max Element in Your array -> " + max(array, size));
        }

}
