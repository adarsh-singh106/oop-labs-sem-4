/**
 * Topic: Mixed (Ternary Operator + Switch)
 * What we have done: Evaluated a numeric score into a letter grade using ternary operators, then printed feedback using a switch statement.
 */
public class Practice20 {
    public static void main(String[] args) {
        System.out.println("--- Topic: Mixed (Ternary & Switch) ---");
        int score = 85;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : "C";
        switch(grade) {
            case "A": System.out.println("Grade A: Excellent"); break;
            case "B": System.out.println("Grade B: Good job"); break;
            default: System.out.println("Grade C: Keep trying");
        }
    }
}