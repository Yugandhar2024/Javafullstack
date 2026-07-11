package oop;

/**
 * StaticVariableDemo - Demonstrates static variables and methods
 * 
 * Learning Objectives:
 * - Understand static vs instance variables
 * - Learn about class-level vs object-level variables
 * - Practice static method definitions
 * - Understand when static is appropriate
 * 
 * Static Variables:
 * - Belong to the CLASS, not individual objects
 * - Shared across all instances
 * - Initialized once when class is loaded
 * - Accessed via ClassName.variableName
 * 
 * Instance Variables:
 * - Belong to each OBJECT individually
 * - Each object has its own copy
 * - Default value depends on type (0 for int, null for objects)
 * - Accessed via objectReference.variableName
 * 
 * Usage Guide:
 * - Use STATIC for: Counters, constants, shared resources
 * - Use INSTANCE for: Object-specific data
 * 
 * @author Learning Repository
 * @version 1.0
 */
public class StaticVariableDemo {
    
    /**
     * Static variable - shared across all instances
     * This counter tracks how many StaticVariableDemo objects were created
     */
    public static int objectCounter = 0;
    
    /**
     * Instance variable - unique to each object
     * Different for each StaticVariableDemo instance
     */
    public int instanceNumber;
    
    /**
     * Constructor - increments static counter each time an object is created
     * 
     * @param number the instance number for this object
     */
    public StaticVariableDemo(int number) {
        this.instanceNumber = number;
        objectCounter++; // Shared across all instances
    }
    
    /**
     * Instance method - operates on instance variables
     * Prints instance-specific data
     */
    public void displayInstanceData() {
        System.out.println("Instance Data:");
        System.out.println("  Instance Number: " + this.instanceNumber);
        System.out.println("  Current object count: " + objectCounter);
    }
    
    /**
     * Static method - can only access static variables
     * Called on class, not on objects
     */
    public static void displayStaticData() {
        System.out.println("\nStatic Data (Class-level):");
        System.out.println("  Total objects created: " + objectCounter);
        // this.instanceNumber;  // ERROR: Cannot access instance variables in static method
    }
    
    /**
     * Main method demonstrating static vs instance variables
     */
    public static void main(String[] args) {
        System.out.println("===== STATIC vs INSTANCE VARIABLES =====");
        System.out.println();
        
        // Access static variable before any object creation
        System.out.println("Initial object count: " + StaticVariableDemo.objectCounter);
        System.out.println();
        
        // Create first object
        System.out.println("Creating object 1...");
        StaticVariableDemo obj1 = new StaticVariableDemo(101);
        obj1.displayInstanceData();
        StaticVariableDemo.displayStaticData();
        System.out.println();
        
        // Create second object
        System.out.println("Creating object 2...");
        StaticVariableDemo obj2 = new StaticVariableDemo(102);
        obj2.displayInstanceData();
        StaticVariableDemo.displayStaticData();
        System.out.println();
        
        // Create third object
        System.out.println("Creating object 3...");
        StaticVariableDemo obj3 = new StaticVariableDemo(103);
        obj3.displayInstanceData();
        StaticVariableDemo.displayStaticData();
        System.out.println();
        
        // Demonstrate that static variable is shared
        System.out.println("===== KEY OBSERVATION =====");
        System.out.println("Notice that objectCounter is shared across all instances!");
        System.out.println("When accessed through any object or class, it shows the same value.");
    }
}
