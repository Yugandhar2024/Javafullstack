package day_1;
import java.util.Scanner;

public class swap {
	public static int rev1(int n) {
		int r = 0;
		while (n != 0) {
			int a = n % 10;
			r = r * 10 + a;
			n = n / 10;
		}
		return r;
	}
	public static int rev2(int n) {
		int r = 0;
		while (n != 0) {
			int a = n%100;
			r = r*100 + a;
			n = n/100;
		}
		return r;
	}
	public static int swap(int n) {
		int temp = rev1(n);
		int a = rev2(temp);
		return a;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Give a Number: ");
		int n = s.nextInt();
		System.out.println("Swapping of the immediate digits in given Number: " + swap(n));
	}
}
