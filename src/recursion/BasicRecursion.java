package recursion;

/**
 * BasicRecursion - demonstrates basic recursion with a countdown.
 */
public class BasicRecursion {
    public static void countDown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
            return;
        }
        System.out.println(n);
        countDown(n - 1);
    }

    public static void main(String[] args) {
        countDown(5);
    }
}
