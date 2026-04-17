import java.util.Scanner;
public class circle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the circle radius: ");
        double r=sc.nextDouble();
        double area=3.14*r*r;
        System.out.println("The area of the circle with radius "+r+" is: "+area);
    }
    
}
