/**
 * Topic: Control Statements (break)
 * What we have done: Used the 'break' keyword to prematurely terminate a loop when the counter reached the number 5.
 */
public class Practice15 {
    public static void main(String[] args) {
        System.out.println("--- Topic: break Keyword ---");
        for(int i = 1; i <= 10; i++) {
            if (i == 5) { 
                System.out.println("Breaking at 5!"); 
                break; 
            }
            System.out.println("i is: " + i);
        }
    }
}