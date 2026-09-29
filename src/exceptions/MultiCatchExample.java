package exceptions;

/**
 * MultiCatchExample - demonstrates Java multi-catch exception handling.
 */
public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Handled exception: " + e.getClass().getSimpleName());
        }
    }
}
