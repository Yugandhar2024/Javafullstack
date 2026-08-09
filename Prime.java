package day_1;

public class Prime {
	public static boolean isPrime(int n) {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
			}
	public static void main(String[] args) {
		int[] arr= {101,202,44,59,78,7};
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				c++;
			}
		}
		System.out.println("Count of the prime number in given array:"+c);
	}
}
