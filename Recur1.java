/*
public class Recur1 { // program to print digits in given number individually

	public static void printDigits(int n) {
		if (n == 0)
			return;

		printDigits(n / 10);   
		System.out.print(n % 10 + " ");  
	}

	public static void main(String[] args) {
		int n = 134;
		System.out.print("Digits in given number : ");
		printDigits(n);
	}
}
*/
/* Expected Output:
Individual Digits in given number : 1 3 4 
  */

public class Recur1 {
	public static boolean isPrime(int n) { //check given number is prime or not.
		if(n<=1)
			return false;
		for(int i=2 ; i<=n/2 ; i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args){
		boolean res = isPrime(41);
		System.out.println("Is given number is Prime number : "+res);
		
	}
}
/*Expected Output:
Is given number is Prime number : true
*/
