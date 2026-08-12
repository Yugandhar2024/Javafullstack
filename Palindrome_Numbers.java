package day_1;

public class Palindrome_Numbers {
	
		public static boolean isPalindrome(int n) {
			int rev=0;
			int temp=n;
			while(n!=0) {
				int r=n%10;
				rev=rev*10+r;
				n=n/10;
			}
			return rev==temp;
		}
		public static void main(String[] args) {
			int[] arr= {101,202,44,56,78,987};
			int c=0;
			for(int i=0; i<arr.length; i++) {
				if(isPalindrome(arr[i]))
					c++;
			}
			System.out.println(c);
		}
	}

