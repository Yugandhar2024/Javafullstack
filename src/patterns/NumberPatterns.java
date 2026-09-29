package patterns;

/**
 * NumberPatterns - prints number-based patterns.
 */
public class NumberPatterns {
    public static void printNumberTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNumberTriangle(5);
    }
}
