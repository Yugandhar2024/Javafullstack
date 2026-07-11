package basics;

/**
 * VariableDemo - Demonstrates Java Variable Types and Scope
 * 
 * Learning Objectives:
 * - Understand different variable types (instance, static, local)
 * - Learn about variable scope and lifetime
 * - Explore default values for different variable types
 * 
 * Variables in Java:
 * 1. Instance Variables: Non-static, created per object, default value depends on type
 * 2. Static Variables: Class-level, shared across all instances, exist for program lifetime
 * 3. Local Variables: Method-level, must be initialized before use, scope limited to block
 * 
 * @author Learning Repository
 * @version 1.0
 */
public class VariableDemo {
    
    /**
     * Demonstrates local variable usage
     * Local variables must be initialized before use
     */
    public static void main(String[] args) {
        // Local variable - must be initialized
        int localNumber = 99;
        System.out.println("Local variable int: " + localNumber);
        
        // Demonstrates scope
        {
            int blockScopedVar = 42;
            System.out.println("Block-scoped variable: " + blockScopedVar);
        }
        // blockScopedVar is not accessible here - scope ended
    }
    
    /**
     * Instance variable - non-static
     * Default value: 0 for int
     */
    int instanceNumber;
    
    /**
     * Static variable - class-level
     * Default value: 0 for int
     */
    static int staticNumber;
    
    /**
     * Displays default values of instance and static variables
     */
    void displayDefaults() {
        System.out.println("Default instance int: " + instanceNumber);
        System.out.println("Default static int: " + staticNumber);
    }
}
