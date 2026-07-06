/*
public class Recursion { //program to print Factorial of the given number.
	public static int fact(int n) {
		if(n==0)
			return 1;
	return n*fact(n-1);
	}
	public static void main(String[] args) {
		int r=fact(5);
		System.out.print("Factorial of the given number : "+r);
	}
}
*/
/*Expected Output
Factorial of the given number : 120
*/
/*
public class Recursion { //Program on Sum of even digits in given number.
	public static int sum(int n) {
		if(n<=0)
			return 0;
		if(n%2==0) 
		    return n+sum(n-1);
		else
			return (n-1);
	}
	public static void main(String[] args) {
		System.out.println("Sum of even digits in given number:"+sum(10));
	}
}
*/
/*Expected Output:
Sum of even digits in given number : 30
*/
/*
public class Recursion { //program to print Sum of the digits in given number.
	public static int sum(int n) {
		if(n==0)
			return 0;
		return n%10+sum(n/10);
	}
	public static void main(String[] args) {
		System.out.print("Sum of the digits in given number:");
		System.out.println(sum(999));
	}
}
*/
/*Expected Output:
Sum of the digits in given number : 27
*/
public class Recursion { //Program on Sum of odd digits in given number.
		public static int  sum(int n) {
			if(n<=0)
				return 0;
			if(n%2!=0) 
			    return n+sum(n-1);
			else
				return sum(n-1);
				
		}
		public static void main(String[] args) {
			System.out.println("Sum of odd digits in given number : "+sum(10));
		}
	}
/*Expected Output:
Sum of odd digits in given number : 25
*/
