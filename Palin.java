package assignment;

public class Palin {
	public static boolean isPalind(int n) {
		int rev=0;
		int temp=n;
		while(n!=0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev==temp;
	}
	public static int count(int n) {
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
			return count;
	}
	public static void main(String[] args) {
		int[] arr= {121,3233,54,667766,79,80};
		int current=0;
		for(int i=0;i<arr.length;i++) {
			if(isPalind(arr[i])) {	
			if(count(arr[i])>count(current)) {
				current=arr[i];
			}
		}
		}
		System.out.println(current);
	}
	

}
