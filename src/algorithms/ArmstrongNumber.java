package algorithms;

import java.util.Scanner;

/**
 * ArmstrongNumber - Check if a number is an Armstrong number
 * 
 * Learning Objectives:
 * - Understand Armstrong numbers (narcissistic numbers)
 * - Practice digit extraction and exponentiation
 * - Learn input handling with Scanner
 * 
 * Armstrong Number Definition:
 * A number is an Armstrong number if the sum of its digits raised to
 * the power of the number of digits equals the number itself.
 * 
 * Examples:
 * - 153: 1³ + 5³ + 3³ = 1 + 125 + 27 = 153 (Armstrong)
 * - 370: 3³ + 7³ + 0³ = 27 + 343 + 0 = 370 (Armstrong)
 * - 9474: 9⁴ + 4⁴ + 7⁴ + 4⁴ = 6561 + 256 + 2401 + 256 = 9474 (Armstrong)
 * - 123: 1³ + 2³ + 3³ = 1 + 8 + 27 = 36 ≠ 123 (Not Armstrong)
 * 
 * Algorithm:
 * 1. Count number of digits
 * 2. Extract each digit
 * 3. Raise digit to power of digit count
 * 4. Sum all powered digits
 * 5. Compare sum with original number
 * 
 * Time Complexity: O(log n) where n is the number
 * Space Complexity: O(1)
 * 
 * @author Learning Repository
 * @version 1.0
 */
public class ArmstrongNumber {
    
    /**
     * Checks if a number is an Armstrong number
     * 
     * @param number the number to check
     * @return true if number is Armstrong, false otherwise
     */
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int digitCount = String.valueOf(number).length();
        
        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, digitCount);
            number /= 10;
        }
        
        return result == originalNumber;
    }
    
    /**
     * Main method demonstrating Armstrong number check
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it's Armstrong: ");
        int number = scanner.nextInt();
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }
        
        scanner.close();
    }
    
    /**
     * Prints all Armstrong numbers up to a given limit
     * 
     * @param limit the upper bound
     */
    public static void printArmstrongNumbers(int limit) {
        System.out.println("Armstrong numbers up to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
