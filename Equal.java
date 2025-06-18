import java.util.Scanner;

class Equal
 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = s.nextInt();

        System.out.print("Enter second number: ");
        int num2 = s.nextInt();

       
        if (num1 == num2) {
            System.out.println("Equal operator");
        } else {
            System.out.println("Not equal operator");
        }

        s.close();
    }
}
