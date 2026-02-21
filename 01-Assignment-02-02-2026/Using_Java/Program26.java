/*
Program 26
Java program to delete an element from an array by index
*/

import java.util.Arrays;

public class Program26 {

    public static void main(String[] args) {
        // Create a instance of array class
        MeraArray arr = new MeraArray(5);

        // Check size before
        System.out.println("count before insertion -> " + arr.count() );
        
        // Inserting
        System.out.println("Insert 2,6,9,-1.36");
        arr.insert(2, 0);
        arr.insert(6, 1);
        arr.insert(9,2);
        arr.insert(-1.36,3);
        
        System.out.println("count After insertion -> " + arr.count() );
        System.out.println(arr.show());

        System.out.println("Delete the 6.0 Now " + arr.count() );
        arr.delete(1);
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

    public void delete(int pos){

    if (count == 0){
        throw new RuntimeException("Empty Array");
    }

    if (pos < 0 || pos >= count){
        throw new RuntimeException("Invalid position");
    }

    // Shift elements left
    for(int i = pos; i < count - 1; i++){
        array[i] = array[i + 1];
    }

    count--;
}


    public String show(){
        return Arrays.toString(Arrays.copyOf(array, count));
    }

    public int count(){
        return count;
    }
}
