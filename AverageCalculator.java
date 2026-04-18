/**
 * AverageCalculator - A utility class for calculating statistical measures
 * This class provides methods to calculate average, sum, minimum, and maximum values from an array
 * 
 * @author Yugandhar
 * @version 2.0
 */
class AverageCalculator {

    /**
     * Calculates the average of numbers in an array
     * 
     * @param arr the array of integers
     * @return the average value as a double
     * @throws IllegalArgumentException if array is empty or null
     */
    public static double calculateAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty!");
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    /**
     * Calculates the sum of all numbers in an array
     * 
     * @param arr the array of integers
     * @return the sum of all elements
     * @throws IllegalArgumentException if array is empty or null
     */
    public static int calculateSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty!");
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    /**
     * Finds the minimum value in an array
     * 
     * @param arr the array of integers
     * @return the minimum value
     * @throws IllegalArgumentException if array is empty or null
     */
    public static int findMinimum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty!");
        }
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /**
     * Finds the maximum value in an array
     * 
     * @param arr the array of integers
     * @return the maximum value
     * @throws IllegalArgumentException if array is empty or null
     */
    public static int findMaximum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty!");
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Displays detailed statistics of an array
     * 
     * @param arr the array of integers
     */
    public static void displayStatistics(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null!");
            return;
        }
        try {
            double average = calculateAverage(arr);
            int sum = calculateSum(arr);
            int min = findMinimum(arr);
            int max = findMaximum(arr);

            System.out.println("====== Array Statistics ======");
            System.out.println("Array Elements: " + java.util.Arrays.toString(arr));
            System.out.println("Total Elements: " + arr.length);
            System.out.println("Sum: " + sum);
            System.out.printf("Average: %.2f%n", average);
            System.out.println("Minimum Value: " + min);
            System.out.println("Maximum Value: " + max);
            System.out.println("=============================");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Test Case 1: Basic average calculation
        int[] numbers1 = {10, 20, 30, 40, 50};
        displayStatistics(numbers1);

        System.out.println();

        // Test Case 2: Different set of numbers
        int[] numbers2 = {5, 15, 25, 35, 45, 55};
        displayStatistics(numbers2);

        System.out.println();

        // Test Case 3: Single element
        int[] numbers3 = {100};
        displayStatistics(numbers3);

        System.out.println();

        // Test Case 4: Empty array handling
        int[] numbers4 = {};
        displayStatistics(numbers4);
    }
}