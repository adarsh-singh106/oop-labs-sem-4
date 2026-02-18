/*
Program 21
Java program to implement linear search
*/

import java.util.Scanner;

public class Program21 {
    public static int linearSearch(double[] nums,double target,int size){

        for(int i = 0;i < size;i++){
            if (nums[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the array : ");
        int size = scanner.nextInt();
        
        if (size < 0)
            System.out.println("Invalid Size");
        else{
            double[] array = new double[size];
            System.out.println("Lets Fill out the array : \n");
            for(int i = 0; i <  size;i++){
                System.out.print("Item No." + (i+1) + " : ");
                array[i] = scanner.nextDouble();
            }

            System.out.print("Which Item You want to search ? : ");
            double query = scanner.nextDouble();
            int res = linearSearch(array, query, size);
            if (res != -1){
                System.out.println(query + " is at index = " + res);
            }
            else{
                System.out.println("Item not found");
            }
            scanner.close();
        }

        
    }

}
