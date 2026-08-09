package day_1;

import java.util.Scanner;

public class Sum_Even {
	public static void main(String[] args) {
		System.out.println("Please enter how many values you want to store: ");
		Scanner sc=new Scanner(System.in);
		int s=0;
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0 ; i<size ; i++) {
			System.out.println("Enter the "+i+" index value: ");
			arr[i]=sc.nextInt();
		}
		System.out.println("---------------------------------------");
		System.out.println("Given Array Sum of Even values are :");
		for(int i=0; i<size ; i++) {
			if(arr[i]%2==0) {
				s+=arr[i];
			}
		}
		System.out.println(s);
	}
}
