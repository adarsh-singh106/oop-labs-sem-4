/**
 * Topic: Mixed (While Loop + Bitwise Shift)
 * What we have done: Used a while loop to repeatedly perform a bitwise right shift (>>) on an integer until it reaches 0.
 */
public class Practice18 {
    public static void main(String[] args) {
        System.out.println("--- Topic: Mixed (While & Bitwise Shift) ---");
        int num = 16;
        while (num > 0) {
            System.out.println("Current Value: " + num);
            num = num >> 1;
        }
    }
}