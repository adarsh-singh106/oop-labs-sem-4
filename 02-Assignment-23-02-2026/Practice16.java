/**
 * Topic: Control Statements (continue)
 * What we have done: Used the 'continue' keyword to skip the current iteration for even numbers and proceed to the next iteration.
 */
public class Practice16 {
    public static void main(String[] args) {
        System.out.println("--- Topic: continue Keyword ---");
        for(int i = 1; i <= 5; i++) {
            if (i % 2 == 0) { continue; }
            System.out.println("Odd number printed: " + i);
        }
    }
}