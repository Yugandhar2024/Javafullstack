package basics;

/**
 * ConditionalStatements - Demonstrates if-else and ternary operations
 * 
 * Learning Objectives:
 * - Master if-else conditional statements
 * - Understand ternary operator (?:) for inline conditions
 * - Learn logical operators (&&, ||) in conditions
 * - Understand short-circuit evaluation
 * 
 * Conditional Structures:
 * 1. if statement: Execute if condition is true
 * 2. if-else: Execute one of two blocks
 * 3. if-else if-else: Multiple conditions
 * 4. Ternary operator: condition ? valueIfTrue : valueIfFalse
 * 
 * @author Learning Repository
 * @version 1.0
 */
public class ConditionalStatements {
    
    /**
     * Demonstrates various conditional statements
     */
    public static void main(String[] args) {
        int a = 10, b = 20;
        int x = 5, y = 10;
        
        System.out.println("===== TERNARY OPERATOR =====");
        // Ternary operator: condition ? valueIfTrue : valueIfFalse
        int max = (a > b) ? a : b;
        System.out.println("Maximum of " + a + " and " + b + " is: " + max);
        System.out.println();
        
        System.out.println("===== LOGICAL AND (&&) =====");
        // Logical AND: Both conditions must be true
        if (x < 10 && y > 5) {
            System.out.println("Both conditions are true:");
            System.out.println("x (" + x + ") < 10: true");
            System.out.println("y (" + y + ") > 5: true");
        } else {
            System.out.println("Not both conditions are true");
        }
        System.out.println();
        
        System.out.println("===== LOGICAL OR (||) =====");
        // Logical OR: At least one condition must be true
        if (x > 0 || y < 5) {
            System.out.println("At least one condition is true:");
            System.out.println("x (" + x + ") > 0: true");
            System.out.println("y (" + y + ") < 5: false");
        } else {
            System.out.println("Neither condition is true");
        }
        System.out.println();
        
        System.out.println("===== NESTED IF-ELSE =====");
        int score = 85;
        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else {
            grade = "F";
        }
        System.out.println("Score: " + score + ", Grade: " + grade);
    }
}
