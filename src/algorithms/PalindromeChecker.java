package algorithms;

import java.util.Scanner;

/**
 * PalindromeChecker - Check if a number or string is a palindrome
 * 
 * Learning Objectives:
 * - Understand palindrome definition
 * - Practice string/number reversal
 * - Compare original with reversed value
 * 
 * Palindrome Definition:
 * A palindrome reads the same forwards and backwards.
 * 
 * Examples:
 * - Numbers: 121, 1331, 12321, 11
 * - Strings: racecar, madam, level, noon
 * 
 * Algorithm (Iterative):
 * 1. Extract digits from right to left
 * 2. Build reversed number
 * 3. Compare with original
 * 
 * Algorithm (Recursive):
 * 1. Compare first and last digits
 * 2. Remove first and last digits
 * 3. Recursively check remaining digits
 * 
 * @author Learning Repository
 * @version 1.0
 */
public class PalindromeChecker {
    
    /**
     * Checks if a number is a palindrome (iterative approach)
     * 
     * @param number the number to check
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindromeIterative(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        return originalNumber == reversedNumber;
    }
    
    /**
     * Checks if a string is a palindrome
     * 
     * @param str the string to check
     * @return true if palindrome, false otherwise
     */
    public static boolean isStringPalindrome(String str) {
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = cleaned.length() - 1;
        
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    /**
     * Main method demonstrating palindrome check
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it's a palindrome: ");
        int number = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        if (isPalindromeIterative(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is NOT a palindrome.");
        }
        
        System.out.print("\nEnter a string to check if it's a palindrome: ");
        String str = scanner.nextLine();
        
        if (isStringPalindrome(str)) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is NOT a palindrome.");
        }
        
        scanner.close();
    }
}
