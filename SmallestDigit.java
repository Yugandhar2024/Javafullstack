import java.util.Scanner;
public class SmallestDigit {
	public static int smallestDigit(int num) {
		int n=Math.abs(num);
		int s=9;
		while(n!=0) {
			int d=n%10;
			if(d<s)
				s=d;
		n=n/10;
		}
	return s;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int result=smallestDigit(num);
		System.out.println("Smallest Digit in given Number "+num+" is :"+result);
	}
}
/*Expected Output:
Enter the Number:
41562
Smallest Digit in given Number 41562 is :1
*/
