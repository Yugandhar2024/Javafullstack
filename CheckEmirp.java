package demo1;
import java.util.Scanner;

public class CheckEmirp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isEmirp(num)) {
            System.out.println(num + " is an EMIRP number.");
        } else {
            System.out.println(num + " is NOT an Emirp number.");
        }
    }

    // Method 1: Check if a number is prime
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Method 2: Reverse the digits of a number
    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

    // Method 3: Check if a number is an Emirp
    // (number is prime, its reverse is prime, and reverse != original)
    static boolean isEmirp(int n) {
        int rev = reverse(n);
        return isPrime(n) && isPrime(rev) && rev != n;
    }
}
