package basics;

/**
 * BitwiseOperations - Deep dive into bitwise operator implementations
 * 
 * Learning Objectives:
 * - Master bitwise AND, OR, XOR operations
 * - Understand bit shifting and its applications
 * - Learn practical use cases for bitwise operations
 * 
 * Practical Applications:
 * - Bitwise AND: Extract specific bits, check if number is power of 2
 * - Bitwise OR: Set specific bits
 * - Bitwise XOR: Toggle bits, find unique elements
 * - Left Shift: Fast multiplication by powers of 2
 * - Right Shift: Fast division by powers of 2
 * 
 * @author Learning Repository
 * @version 1.0
 */
public class BitwiseOperations {
    
    /**
     * Demonstrates all bitwise operations with detailed output
     */
    public static void main(String[] args) {
        int a = 5;   // Binary: 0101
        int b = 3;   // Binary: 0011
        
        System.out.println("Operands: a = " + a + " (binary: 0101)");
        System.out.println("          b = " + b + " (binary: 0011)");
        System.out.println();
        
        System.out.println("===== BITWISE AND =====");
        System.out.println("a & b = " + (a & b));   // 0001 = 1
        System.out.println("Result: 0001 (binary) = 1 (decimal)");
        System.out.println("Explanation: Both bits must be 1");
        System.out.println();
        
        System.out.println("===== BITWISE OR =====");
        System.out.println("a | b = " + (a | b));   // 0111 = 7
        System.out.println("Result: 0111 (binary) = 7 (decimal)");
        System.out.println("Explanation: At least one bit must be 1");
        System.out.println();
        
        System.out.println("===== BITWISE XOR =====");
        System.out.println("a ^ b = " + (a ^ b));   // 0110 = 6
        System.out.println("Result: 0110 (binary) = 6 (decimal)");
        System.out.println("Explanation: Bits must be different");
        System.out.println();
        
        System.out.println("===== BITWISE NOT (COMPLEMENT) =====");
        System.out.println("~a = " + (~a));
        System.out.println("Explanation: All bits are inverted");
        System.out.println();
        
        System.out.println("===== LEFT SHIFT =====");
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("Effect: Multiply by 2^1 = 2");
        System.out.println();
        
        System.out.println("===== RIGHT SHIFT (ARITHMETIC) =====");
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("Effect: Divide by 2^1 = 2");
        System.out.println();
        
        System.out.println("===== RIGHT SHIFT (LOGICAL) =====");
        System.out.println("a >>> 1 = " + (a >>> 1));
        System.out.println("Effect: Same as >> for positive numbers");
    }
    
    /**
     * Check if a number is a power of 2 using bitwise AND
     * A power of 2 has only one bit set: 1(1), 2(10), 4(100), 8(1000)...
     * 
     * @param n the number to check
     * @return true if n is a power of 2, false otherwise
     */
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
    
    /**
     * Count the number of set bits (1s) in binary representation
     * 
     * @param n the number
     * @return count of 1s in binary representation
     */
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1; // Right shift by 1
        }
        return count;
    }
}
