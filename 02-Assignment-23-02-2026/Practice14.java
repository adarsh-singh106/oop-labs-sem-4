/**
 * Topic: Nested Loops
 * What we have done: Placed a for-loop inside another for-loop to demonstrate how the inner loop runs completely for every iteration of the outer loop.
 */
public class Practice14 {
    public static void main(String[] args) {
        System.out.println("--- Topic: Nested Loops ---");
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                System.out.println("Outer i: " + i + ", Inner j: " + j);
            }
        }
    }
}