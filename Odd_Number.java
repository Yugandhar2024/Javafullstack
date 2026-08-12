package day_1;

import java.util.Scanner;

public class Odd_Number {
	public static void main(String[] args) {
		System.out.println("Please enter how many values you want to store: ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0 ; i<size ; i++) {
			System.out.println("Enter the "+i+" index value: ");
			arr[i]=sc.nextInt();
		}
		System.out.println("---------------------------------------");
		System.out.println("Given array Odd Indexed values are :");
		for(int i=0; i<size ; i+=2) {
		
				System.out.println(arr[i]);
		}
	}
}


