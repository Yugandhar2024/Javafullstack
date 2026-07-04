/*
public class Recur{ //Prg to print no's from n to 1 using recursion.
	public static void print(int n) {
		if(n<=0)
			return;
		System.out.println(n);
		print(n-1);
	}
	public static void main(String[] args) {
		print(5);
	}
}
*/
/*Expected Output:
5
4
3
2
1
*/
/*
public class Recur { //Prg to print no's from 1 to n using recursion.
	public static void print(int n) {
		if(n<=0)
			return;
		print(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		System.out.println("Numbers from 1 to N numbers:");
		print(4);
	}
}
*/
/* Expected Output:
Numbers from 1 to N numbers:
1
2
3
4
*/
/*
public class Recur { //Program to print only odd no's from n to 1 using recursion.
	public static void odd(int n) {
		if(n<=0)
			return;
		if(n%2!=0) {
			System.out.println(n);
		}
		odd(n-1);
	}
	public static void main(String[] args) {
		System.out.println("Printing only odd no's from n to 1 using Recursion:");
		odd(20);

	}

}
*/
/*Expected Output:
Printing only odd no's from n to 1 using Recursion:
19
17
15
13
11
9
7
5
3
1
*/
/*
public class Recur{ //Program to print only even no's from n to 1 using recursion.
	public static void even(int n) {
		if(n<=0)
			return;
		if(n%2==0) {
			System.out.println(n);
		}
		even(n-1);
	}
	public static void main(String[] args) {
		System.out.println("Printing only even no's from n to 1 using Recursion:");
		even(20);
	}
}
*/
/*Expected Output:
Printing only even no's from n to 1 using Recursion:
20
18
16
14
12
10
8
6
4
2
*/
/*
public class Recur{ //Program to print only even no's from 1 to n using recursion.
	public static void even(int n) {
		if(n<=0)
			return;
		even(n-1);
		if(n%2==0) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		System.out.println("Printing only even no's from 1 to n using Recursion:");
		even(10);
	}
}
*/
/*Expected Output:
Printing only even no's from 1 to n using Recursion:
2
4
6
8
10
*/
public class Recur { //Program to print only odd no's from 1 to n using recursion.
	public static void odd(int n) {
		if(n<=0)
			return;
		odd(n-1);
		if(n%2!=0) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		System.out.println("Printing only odd no's from 1 to n using Recursion:");
		odd(20);
	}
}
/*Expected Output:
Printing only odd no's from 1 to n using Recursion:
1
3
5
7
9
11
13
15
17
19
*/
