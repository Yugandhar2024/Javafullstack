package assignment;
import java.util.*;

public class Prime {
	
	// helper method to check if a number is prime
	static boolean isPrime(int n) {
		if (n < 2) return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] arr = {7,6,4,3,9,5,6};
		System.out.println(Arrays.toString(arr));
		
		int index = 0;
		
		// Pass 1: copy all prime numbers to the front
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				arr[index] = arr[i];
				index++;
			}
		}
		
		// Pass 2: fill the rest with 1 (placeholder), same as your negative example
		for (int i = index; i < arr.length; i++) {
			arr[i] = 1;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}