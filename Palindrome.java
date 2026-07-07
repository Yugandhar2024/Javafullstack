public class Palindrome { //program to check Palindrome number.
	public static boolean isPalin(int n,int f) {
		if(n<=1)
			return false;
		if(f==1)
			return true;
		if(n%f==0)
			return false;
		return isPalin(n,f-1);
	}
	public static void main(String[] args) {
		int n = 11;
		System.out.print("Is given number is Palindrome : "+isPalin(n,n/2));
	}
}
/*Expected output:
s given number is Palindrome : true
*/
