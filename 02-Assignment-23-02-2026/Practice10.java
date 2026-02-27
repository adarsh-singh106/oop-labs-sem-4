/**
 * Topic: Control Statements (switch)
 * What we have done: Used a switch statement to map an integer to a specific day of the week, including a default case.
 */
public class Practice10 {
    public static void main(String[] args) {
        System.out.println("--- Topic: switch Statement ---");
        int day = 3;
        switch(day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Other day");
        }
    }
}