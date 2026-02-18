/*
Program 22
Java program to implement binary search
*/

import java.util.Arrays;
import java.util.Scanner;

public class Program22 {
    public static int binarySearch(double[] nums,double target,int size){
        int start = 0,end = size - 1,mid;
        while (start <= end) {
            mid =  start + (end - start) / 2 ;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target){
                end = mid - 1;
            }
            else if (nums[mid] < target ){
                start = mid + 1 ;
            }
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
            Arrays.sort(array);
            System.out.print("Which Item You want to search ? : ");
            double query = scanner.nextDouble();
            int res = binarySearch(array, query, size);
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
