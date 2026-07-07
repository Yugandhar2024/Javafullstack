/*
public class Recur2 { //Printing fabonacci series from 0 to n number.
	public static void fib(int a,int b,int n) {
		if(n<=0)
			return;
		System.out.println(a);
		fib(b,a+b,n-1);
	}
	public static void main(String[] args) {
		System.out.print("Printing fabonacci series from 0 to n number : ");
		fib(0,1,7);
	}
}
*/
/*Expected Output:
Printing fabonacci series from 0 to n number : 0
1
1
2
3
5
8

*/
public class Recur2 {
	public static void fib(int a, int b, int n) {
		if (n == 0) {
			System.out.print(a);
			return;
		}
		fib(b, a + b, n - 1);
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.print(""+ n + " Position Fibonacci number : ");
		fib(0, 1, n);
	}
}
/*Expected Output:
5 Position Fibonacci number : 5
*/
