/**
 * Topic: Control Statements (while loop)
 * What we have done: Executed a block of code repeatedly as long as the counter variable 'i' was less than or equal to 5.
 */
public class Practice11 {
    public static void main(String[] args) {
        System.out.println("--- Topic: while Loop ---");
        int i = 1;
        while(i <= 5) {
            System.out.println("While loop iteration: " + i);
            i++;
        }
    }
}