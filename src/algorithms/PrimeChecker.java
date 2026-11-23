package algorithms;

/**
 * PrimeChecker - checks whether a number is prime.
 */
public class PrimeChecker {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int value = 29;
        if (isPrime(value)) {
            System.out.println(value + " is a prime number.");
        } else {
            System.out.println(value + " is not a prime number.");
        }
    }
}
