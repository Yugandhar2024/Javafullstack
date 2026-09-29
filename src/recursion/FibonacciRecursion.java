package recursion;

/**
 * FibonacciRecursion - prints Fibonacci numbers recursively.
 */
public class FibonacciRecursion {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int limit = 10;
        for (int i = 0; i < limit; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
}
