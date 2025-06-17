class Conditional
{
public static void main(String [] args)
{
int a = 10, b = 20;
int x = 5, y = 10;

int max = (a > b) ? a : b;  
System.out.println("Maximum is " + max);
if (x < 10 && y > 5) {
    System.out.println("Both conditions are true");
}

if (x > 0 || y < 5) {
    System.out.println("At least one condition is true");
}


}
}
