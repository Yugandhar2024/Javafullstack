/*
class Loops
{
public static void main(String [] args)
{
 for (int i=0;i<10;i++)
{
System.out.println("Bright IT Career");
}
}
}
*/
/*Loop-2*/
/*
class Loops
{
public static void main(String[] args)
{
int i=1;
while(i<=20)
{
System.out.println(i);
i++;
}
}
}*/
/*Program-3*/
/*
import java.util.Scanner;

class Loops
 {
public static void main(String[] args) {
 Scanner s= new Scanner(System.in);
 System.out.print("Enter first number: ");
 int num1 = s.nextInt();
System.out.print("Enter second number: ");
 int num2 = s.nextInt();
if (num1 == num2) {
System.out.println("Equal operator");
} else 
{
  System.out.println("Not equal operator");
}
s.close();
}
}*/
/*program-4*/
/*
import java.util.Scanner;
class Loops
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a number:");
int n=s.nextInt();
if(n%2==0)
{
System.out.println("Even Number:"+n);
}
else
{
System.out.println("Odd Number:"+n);
}
}
}*/
/*program-5*/
/*
import java.util.Scanner;
class Loops{
    public static void main(String[] args) {
Scanner s= new Scanner(System.in);
System.out.print("Enter first number: ");
int n1 =s.nextInt();
System.out.print("Enter second number: ");
int n2 = s.nextInt();
System.out.print("Enter third number: ");
int n3 = s.nextInt();
int largest;
if (n1 >= n2 && n1 >= n3) 
largest = n1;
 } 
else if (n2 >= n1 && n2 >= n3) 
{
 largest = n2;
 } else {
 largest = n3;
  }
System.out.println("The largest number is: " + largest);

s.close();
 }
}*/
/*program-6*/
/*
public class Loops {
 public static void main(String[] args) {
 int y = 10;
  while (y <= 100) {
  if (y % 2 == 0) {
   System.out.println(y);
  }
  y++;
 } }
}
*/
/*program-7*/
/*
import java.util.Scanner;

public class Loops{
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
 int num = scanner.nextInt();
int digits = String.valueOf(num).length();
int sum = 0;
 int temp = num;
while (temp != 0) {
 int digit = temp % 10;
  sum += Math.pow(digit, digits);
  temp /= 10;
  }
 if (sum == num) 
{
 System.out.println(num + " is an Armstrong number.");
 } else
 {
 System.out.println(num + " is not an Armstrong number.");
  }

 scanner.close();
    }
}*/
/*program-8*/
/*import java.util.Scanner;

public class Loops{
 public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = s.nextInt();
if(num%2==0)
    {
System.out.println("Even Number: "+num);
    }
else
{
System.out.println("Odd Number:"+num);
}
}
}
*/
/*program-9*/
/*
class Loops
{
public static void main(String[] args) 
{
int i=1;
do 
{
System.out.println(i);
i++;
} 
while (i <= 10);
}
}
*/
/*program-10*/
/*
import java.util.Scanner;

public class Loops{
  public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
 int num = scanner.nextInt();
int originalNum = num;
 int reversedNum = 0;
while (num != 0) {
 int digit = num % 10;
 reversedNum = reversedNum * 10 + digit;
 num /= 10; }
if (originalNum == reversedNum) {
System.out.println(originalNum + " is a palindrome number.");
        }
 else {
System.out.println(originalNum + " is not a palindrome number.");
        }

 escanner.close();
    }
}
*/
/*program-11*/
/*
import java.util.Scanner;

public class Loops{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a number: ");
 int num = scanner.nextInt();
 switch (num % 2) {
  case 0:
  System.out.println(num + " is an even number.");
   break;
 case 1:
 System.out.println(num + " is an odd number.");
 break;
  default:
System.out.println("Invalid input.");
}

scanner.close();
    }
}
*/
/*program-12*//*
import java.util.Scanner;

public class Loops{
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
        
    System.out.print("Enter gender (M/F): ");
  char gender = scanner.next().charAt(0); 

  switch (Character.toUpperCase(gender)) {
  case 'M':
 System.out.println("Gender is Male"break;
    case 'F':
  System.out.println("Gender is Female");
   break;
  default:
 System.out.println("Invalid input. Please enter M or F.");
        }

scanner.close();
    }
}*/
/*program-13*/
public class Loops {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        if (a >= b && a >= c) {
            System.out.println(a + " is the largest number.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest number.");
        } else {
            System.out.println(c + " is the largest number.");
        }
    }
}








