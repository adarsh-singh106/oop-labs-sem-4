/**
 * Topic: Mixed (Logical Operators + Modulus)
 * What we have done: Combined a for-loop with an if-statement and logical AND (&&) to find numbers divisible by both 3 and 5.
 */
public class Practice17 {
    public static void main(String[] args) {
        System.out.println("--- Topic: Mixed (Logical & Arithmetic) ---");
        for(int i = 1; i <= 15; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number divisible by 3 and 5: " + i);
            }
        }
    }
}