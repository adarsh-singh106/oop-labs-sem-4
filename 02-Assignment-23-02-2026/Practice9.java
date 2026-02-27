/**
 * Topic: Control Statements (if-else)
 * What we have done: Checked if a number is even or odd using the modulus operator inside an if-else block.
 */
public class Practice9 {
    public static void main(String[] args) {
        System.out.println("--- Topic: if-else Statement ---");
        int num = 8;
        if (num % 2 == 0) {
            System.out.println(num + " is an Even number");
        } else {
            System.out.println(num + " is an Odd number");
        }
    }
}