/*
Program 25
Java program to insert a number at any position in an array
*/

import java.util.Arrays;

public class Program25 {

    public static void main(String[] args) {
        // Create a instance of array class
        MeraArray arr = new MeraArray(5);

        // Check size before
        System.out.println("count before insertion -> " + arr.count() );
        
        // Inserting
        System.out.println("Insert 2,6,-1");
        arr.insert(2, 0);
        arr.insert(6, 1);
        arr.insert(-1,2);

        System.out.println("count After insertion -> " + arr.count() );
        System.out.println(arr.show());

    }

}
class MeraArray {

    private int size;        // capacity
    private double[] array;
    private int count;       // number of elements stored

    public MeraArray(int size){
        this.size = size;
        this.array = new double[size];
        this.count = 0;
    }

    public void insert(double data, int pos){

        if (count == size){
            throw new RuntimeException("Array is full");
        }

        if (pos < 0 || pos > count){
            throw new RuntimeException("Invalid position");
        }

        // Shift elements right
        for(int i = count; i > pos; i--){
            array[i] = array[i - 1];
        }

        array[pos] = data;
        count++;
    }

    public String show(){
        return Arrays.toString(Arrays.copyOf(array, count));
    }

    public int count(){
        return count;
    }
}
