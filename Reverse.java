package day_1;

public class Reverse {
	public static int reverse(int n) {
		int rev=0;
		while(n!=0) {
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
		return rev;
	}
public static void main(String[] args) {
	int[] arr= {178,123,44,55,765};
	for(int i=0;i<arr.length;i++) {
		System.out.println(reverse(arr[i]));
	}
	
}
}
