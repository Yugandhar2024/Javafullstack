/**
 * Program to print square values from 1 to n with tracing
 * This program demonstrates a simple loop with detailed trace output
 */

public class SquareNumbers {
    
    /**
     * Main method - entry point of the program
     */
    public static void main(String[] args) {
        int n = 10; // Define the range
        
        System.out.println("=".repeat(60));
        System.out.println("Program: Print Square Values from 1 to " + n);
        System.out.println("=".repeat(60));
        
        // Call the method to print squares with tracing
        printSquaresWithTrace(n);
        
        System.out.println("=".repeat(60));
        System.out.println("Program Execution Completed!");
        System.out.println("=".repeat(60));
    }
    
    /**
     * Method to print square values with detailed tracing
     * @param n - The upper limit
     */
    public static void printSquaresWithTrace(int n) {
        System.out.println("\n[TRACE] Starting method: printSquaresWithTrace()");
        System.out.println("[TRACE] Input parameter n = " + n);
        System.out.println("[TRACE] Initializing loop counter i = 1");
        
        System.out.println("\n" + "-".repeat(60));
        System.out.println(String.format("%-10s %-15s %-35s", "Number", "Square", "Trace Details"));
        System.out.println("-".repeat(60));
        
        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            // Calculate square
            int square = i * i;
            
            // Trace output
            System.out.print(String.format("%-10d %-15d", i, square));
            System.out.println("[TRACE] i=" + i + " | square=" + i + "*" + i + "=" + square);
        }
        
        System.out.println("-".repeat(60));
        System.out.println("[TRACE] Loop completed successfully");
        System.out.println("[TRACE] Method execution finished: printSquaresWithTrace()");
    }
    
    /**
     * Alternative method with detailed step-by-step tracing
     */
    public static void printSquaresWithDetailedTrace(int n) {
        System.out.println("\n[TRACE] ========== DETAILED TRACE ==========");
        System.out.println("[TRACE] Method: printSquaresWithDetailedTrace()");
        System.out.println("[TRACE] Input: n = " + n);
        
        for (int i = 1; i <= n; i++) {
            System.out.println("\n[TRACE] ========== ITERATION " + i + " ==========");
            System.out.println("[TRACE] Loop condition check: i (" + i + ") <= n (" + n + ") ? TRUE");
            System.out.println("[TRACE] Current value of i: " + i);
            
            int square = i * i;
            System.out.println("[TRACE] Calculating square: " + i + " * " + i + " = " + square);
            System.out.println("[TRACE] OUTPUT: " + i + " -> " + square);
            
            System.out.println("[TRACE] Increment: i = " + i + " + 1 = " + (i + 1));
        }
        
        System.out.println("\n[TRACE] ========== LOOP EXIT ==========");
        System.out.println("[TRACE] Final check: i (" + (n + 1) + ") <= n (" + n + ") ? FALSE");
        System.out.println("[TRACE] Method execution completed");
    }
}
