/*Assignment*/
/*
class Operator
{
public static void main(String[] args)
{
 int a=25;
int b=12;
System.out.println("Addition Assignment of "+a+" and "+b+" is: "+(a+=b));
System.out.println("Subtraction Assignment of "+a+" and "+b+" is: "+(a-=b));
System.out.println("Division Assignment of "+a+" and "+b+" is: "+(a%=b));
System.out.println("Multiplication Assignment of "+a+" and "+b+" is: "+(a*=b));
System.out.println("Modulo Division Assignment of "+a+" and "+b+" is: "+(a%=b));
}
}*/
/*Comparision*/
/*class Operator
{
public static void main(String[] args)
{
int x = 10;
int y = 20;

System.out.println(x == y); 
System.out.println(x != y); 
System.out.println(x > y);  
System.out.println(x < y);  
System.out.println(x >= y); 
System.out.println(x <= y); 
}
}*/
/*Conditional*/
/*class Operator
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
}*/
/*Unary*/
/*class Operator 
{
    public static void main(String[] args) {
        int a = 10;
        int b = -a;         
        int c = +a;         

        int x = 5;
        int preInc = ++x;   
        int postInc = x++;  

        int y = 5;
        int preDec = --y;   
        int postDec = y--; 

        boolean flag = true;
        boolean notFlag = !flag;

        int n = 5;
        int bitwiseNot = ~n; // Bitwise complement: ~5 = -6
        System.out.println("Unary minus of a: " + b);
        System.out.println("Unary plus of a: " + c);
        System.out.println("Pre-increment: " + preInc);
        System.out.println("Post-increment: " + postInc);
        System.out.println("Final value of x: " + x);
        System.out.println("Pre-decrement: " + preDec);
        System.out.println("Post-decrement: " + postDec);
        System.out.println("Final value of y: " + y);
        System.out.println("Logical NOT of flag: " + notFlag);
        System.out.println("Bitwise complement of 5: " + bitwiseNot);
    }
}*/
/*Bitwise*/
class Operator {
    public static void main(String[] args) {
        int a = 5;  
        int b = 3;  

        System.out.println("a & b = " + (a & b));   
        System.out.println("a | b = " + (a | b));   
        System.out.println("a ^ b = " + (a ^ b));   
        System.out.println("~a = " + (~a));         
        System.out.println("a << 1 = " + (a << 1)); 
        System.out.println("a >> 1 = " + (a >> 1)); 
        System.out.println("a >>> 1 = " + (a >>> 1)); 
    }
}
  
