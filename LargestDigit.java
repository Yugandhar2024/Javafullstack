import java.util.Scanner;
public class LargestDigit { //Print the largest digit in given number 
	public static int largestDigit(int num) {
		int n=Math.abs(num);
		int l=0;
		while(n!=0) {
			int d=n%10;
			if(d>l)
				l=d;
		n=n/10;
		}
	return l;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int result=largestDigit(num);
		System.out.println("Largest Digit in given Number "+num+" is :"+result);
	}
}
/*Expected output:
Enter the Number:
12987
Largest Digit in given Number 12987 is :9
*/
