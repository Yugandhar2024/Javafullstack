import java.util.*;
class Multi
{
public static void Repeat()
{
Scanner s=new Scanner(System.in);
try
{
System.out.println("Enter the Numerator:");
int a=s.nextInt();
System.out.println("Enter the Denominator:");
int b=s.nextInt();
int c=a/b;
System.out.println(c);
}
catch(ArithmeticException e)
{
System.out.println("Cannot divide by zero");
Repeat();
}
catch(InputMismatchException e)
{
System.out.println("Enter the correct Input");
Repeat();
}
catch(Exception e)
{
System.out.println("Can't define"+e);
Repeat();
}
}
public static void main(String[] abcd)
{
Repeat();
}
}
