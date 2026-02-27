/**
 * Topic: Bitwise Operators
 * What we have done: Used bitwise AND (&), OR (|), XOR (^), and Complement (~) on two integer values.
 */
public class Practice2 {
    public static void main(String[] args) {
        System.out.println("--- Topic: Bitwise Operators ---");
        int a = 5, b = 7;
        System.out.println("AND: " + (a & b) + ", OR: " + (a | b) + ", XOR: " + (a ^ b) + ", Complement: " + (~a));
    }
}