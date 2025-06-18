import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = s.nextInt();

        int originalNumber = number;
        int result = 0;
        int digits = String.valueOf(number).length;

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, digits); 
            number /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }

        s.close();
    }
}
