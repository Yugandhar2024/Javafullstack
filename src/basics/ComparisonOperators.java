package basics;

/**
 * ComparisonOperators - Relational and Comparison Operator Demonstrations
 * 
 * Learning Objectives:
 * - Understand all comparison operators
 * - Learn how comparisons are used in conditional statements
 * - Practice comparing different data types
 * 
 * Comparison Operators:
 * - == : Equal to
 * - != : Not equal to
 * - >  : Greater than
 * - <  : Less than
 * - >= : Greater than or equal to
 * - <= : Less than or equal to
 * 
 * Important: Use == for primitives, .equals() for objects
 * 
 * @author Learning Repository
 * @version 1.0
 */
public class ComparisonOperators {
    
    /**
     * Demonstrates all comparison operators
     */
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        
        System.out.println("Comparing: x = " + x + ", y = " + y);
        System.out.println();
        
        // Equal to
        System.out.println("x == y: " + (x == y) + " (false)");
        
        // Not equal to
        System.out.println("x != y: " + (x != y) + " (true)");
        
        // Greater than
        System.out.println("x > y: " + (x > y) + " (false)");
        
        // Less than
        System.out.println("x < y: " + (x < y) + " (true)");
        
        // Greater than or equal to
        System.out.println("x >= y: " + (x >= y) + " (false)");
        
        // Less than or equal to
        System.out.println("x <= y: " + (x <= y) + " (true)");
    }
    
    /**
     * Demonstrates comparison with strings (incorrect and correct)
     */
    public static void demonstrateStringComparison() {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        System.out.println("\n===== STRING COMPARISON =====");
        
        // Wrong way: Compares references, not content
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        
        // Correct way: Compares content
        System.out.println("str1.equals(str2): " + (str1.equals(str2)));
        System.out.println("str1.equals(str3): " + (str1.equals(str3)));
    }
}
