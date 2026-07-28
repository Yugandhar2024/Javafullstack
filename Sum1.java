package b;
public class Sum1 {
	// Made this a static nested class so it can hold a static method
	public static class LargestDigit {
		public static int largestDigit(int num) {
			int n = Math.abs(num);
			int l = 0;
			while (n != 0) {
				int d = n % 10;
				if (d > l)
					l = d;
				n = n / 10;
			}
			return l;
		}
	}
	public static int smallestDigit(int num) {
		int n = Math.abs(num);
		int s = 9;
		while (n != 0) {
			int d = n % 10;
			if (d < s)
				s = d;
			n = n / 10;
		}
		return s;
	}
	public static int factorial(int n) {
		int res = 1;
		for (int i = n; i >= 1; i--) {
			res = res * i;
		}
		return res;
	}
	public static void main(String[] args) {
		Sum1 s1 = new Sum1();
		int l1 = LargestDigit.largestDigit(133);   
		int sm = s1.smallestDigit(133);            
		int r = s1.factorial(l1) + s1.factorial(sm);
		System.out.println("Factorial of smallest and largest digit in given No: "+r);
	}
}
/*Expected Output:
Factorial of smallest and largest digit in given No: 7
*/
