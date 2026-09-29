package basics;

/**
 * LoopExamples - Demonstrates for, while, and do-while loops.
 */
public class LoopExamples {
    public static void main(String[] args) {
        System.out.println("=== For Loop ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("for loop count: " + i);
        }

        System.out.println("\n=== While Loop ===");
        int j = 1;
        while (j <= 5) {
            System.out.println("while loop count: " + j);
            j++;
        }

        System.out.println("\n=== Do-While Loop ===");
        int k = 1;
        do {
            System.out.println("do-while loop count: " + k);
            k++;
        } while (k <= 5);
    }
}
