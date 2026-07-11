package basics;

/**
 * OperatorExamples - Comprehensive Operator Demonstrations
 * 
 * Learning Objectives:
 * - Understand different operator types in Java
 * - Learn operator precedence and associativity
 * - Practice arithmetic, assignment, comparison, logical, and bitwise operators
 * 
 * Operators covered:
 * 1. Arithmetic: +, -, *, /, %
 * 2. Assignment: =, +=, -=, *=, /=, %=
 * 3. Comparison: ==, !=, >, <, >=, <=
 * 4. Logical: &&, ||, !
 * 5. Bitwise: &, |, ^, ~, <<, >>, >>>
 * 6. Unary: +, -, ++, --, !
 * 
 * @author Learning Repository
 * @version 1.0
 */
public class OperatorExamples {
    
    /**
     * Demonstrates bitwise operations
     * Shows AND, OR, XOR, complement, and shift operations
     */
    public static void main(String[] args) {
        System.out.println("===== BITWISE OPERATIONS =====");
        int a = 5;   // Binary: 0101
        int b = 3;   // Binary: 0011
        
        // Bitwise AND: Both bits must be 1
        System.out.println("a & b = " + (a & b));   // 0001 = 1
        
        // Bitwise OR: At least one bit must be 1
        System.out.println("a | b = " + (a | b));   // 0111 = 7
        
        // Bitwise XOR: Bits must be different
        System.out.println("a ^ b = " + (a ^ b));   // 0110 = 6
        
        // Bitwise NOT (complement): Inverts all bits
        System.out.println("~a = " + (~a));         // Inverts 0101 = -6
        
        // Left shift: Multiply by powers of 2
        System.out.println("a << 1 = " + (a << 1)); // 5 * 2 = 10
        
        // Right shift (arithmetic): Divide by powers of 2
        System.out.println("a >> 1 = " + (a >> 1)); // 5 / 2 = 2
        
        // Right shift (logical): Fill with zeros
        System.out.println("a >>> 1 = " + (a >>> 1)); // 5 / 2 = 2
    }
    
    /**
     * Demonstrates unary operators
     */
    public static void demonstrateUnaryOperators() {
        System.out.println("\n===== UNARY OPERATORS =====");
        int x = 5;
        
        // Pre-increment: Increment first, then use value
        System.out.println("++x = " + (++x)); // x becomes 6, prints 6
        
        // Post-increment: Use value first, then increment
        System.out.println("x++ = " + (x++)); // prints 6, x becomes 7
        System.out.println("After post-increment: " + x); // prints 7
        
        // Pre-decrement: Decrement first, then use value
        System.out.println("--x = " + (--x)); // x becomes 6, prints 6
        
        // Post-decrement: Use value first, then decrement
        System.out.println("x-- = " + (x--)); // prints 6, x becomes 5
    }
    
    /**
     * Demonstrates logical operators
     */
    public static void demonstrateLogicalOperators() {
        System.out.println("\n===== LOGICAL OPERATORS =====");
        int a = 10, b = 20;
        int x = 5, y = 10;
        
        // AND operator: Both conditions must be true
        if (x < 10 && y > 5) {
            System.out.println("Both conditions are true (AND)");
        }
        
        // OR operator: At least one condition must be true
        if (x > 0 || y < 5) {
            System.out.println("At least one condition is true (OR)");
        }
        
        // NOT operator: Negates the condition
        boolean flag = true;
        System.out.println("NOT true = " + !flag);
    }
    
    /**
     * Demonstrates assignment operators
     */
    public static void demonstrateAssignmentOperators() {
        System.out.println("\n===== ASSIGNMENT OPERATORS =====");
        int a = 25;
        int b = 12;
        
        System.out.println("a = " + a + ", b = " + b);
        
        a += b; // a = a + b = 37
        System.out.println("a += b => " + a);
        
        a -= b; // a = a - b = 25
        System.out.println("a -= b => " + a);
        
        a *= b; // a = a * b = 300
        System.out.println("a *= b => " + a);
        
        a /= b; // a = a / b = 25
        System.out.println("a /= b => " + a);
    }
}
