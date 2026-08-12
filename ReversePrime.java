package day_1;

import java.util.Scanner;
public class ReversePrime {
	
	public static boolean isPrime(int n) {
		if(n <= 1) return false;
		
		if(n == 2) return true;
		
		if(n % 2 == 0) return false;
		
		for (int i = 3; i <= n / 2; i += 2) {
			if(n % i == 0) return false;
		}
		
		return true;
	}
	
	public static int reverseNum(int n) {
		int rev = 0;
		
		while(n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many number we want to store in array :");
		
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		System.out.println("Enter the values :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("After the reversing the prime numbers the array :");
		for (int i = 0; i < arr.length; i++) {
			if(isPrime(arr[i])) System.out.println(reverseNum(arr[i]) + " ");
			else System.out.println(arr[i]);
		}
		
		sc.close();
	}
}