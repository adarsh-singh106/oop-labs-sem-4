/**
 * Topic: Operator Precedence
 * What we have done: Wrote a math expression without parentheses to show how Java prioritizes multiplication/division over addition/subtraction.
 */
public class Practice7 {
    public static void main(String[] args) {
        System.out.println("--- Topic: Operator Precedence ---");
        int result = 10 + 5 * 2 - 8 / 4;
        System.out.println("Result of 10 + 5 * 2 - 8 / 4 is: " + result);
    }
}