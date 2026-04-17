import java.util.Scanner;
public class Scan {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        System.out.print("Enter your height(_in cm): ");
        double height=sc.nextDouble();
        System.out.println("Your name is: "+name);
        System.out.println("Your age is: "+age);
        System.out.println("Your height is: "+height+" meters");
        
    }
    
}
