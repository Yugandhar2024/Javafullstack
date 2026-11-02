package patterns;

/**
 * SquareNumberPatterns - prints square and numbered pattern examples.
 */
public class SquareNumberPatterns {
    public static void printSquarePattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printNumberSquare(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Square Pattern");
        printSquarePattern(4);

        System.out.println("\nNumber Square Pattern");
        printNumberSquare(4);
    }
}
