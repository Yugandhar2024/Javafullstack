import java.util.Scanner;
class Largest{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 =s.nextInt();

        System.out.print("Enter second number: ");
        int n2 = s.nextInt();

        System.out.print("Enter third number: ");
        int n3 = s.nextInt();

        int largest;

        if (n1 >= n2 && n1 >= n3) {
            largest = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            largest = n2;
        } else {
            largest = n3;
        }

        System.out.println("The largest number is: " + largest);

        s.close();
    }
}
