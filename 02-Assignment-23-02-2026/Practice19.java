/**
 * Topic: Mixed (Labeled break in Nested Loops)
 * What we have done: Used a label to break out of an outer loop from within an inner loop when a specific condition is met.
 */
public class Practice19 {
    public static void main(String[] args) {
        System.out.println("--- Topic: Labeled Break ---");
        outerLoop:
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                if(i == 2 && j == 2) { 
                    System.out.println("Breaking outer loop at i=2, j=2");
                    break outerLoop; 
                }
                System.out.println("Nested: " + i + "," + j);
            }
        }
    }
}