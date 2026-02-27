/**
 * Topic: Control Statements (do-while loop)
 * What we have done: Guaranteed that the loop body executes at least once before checking the condition at the end.
 */
public class Practice12 {
    public static void main(String[] args) {
        System.out.println("--- Topic: do-while Loop ---");
        int i = 1;
        do {
            System.out.println("Do-while iteration: " + i);
            i++;
        } while(i <= 5);
    }
}