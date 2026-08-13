package assignment;

import java.util.Arrays;

public class RightN {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int n=2;
		for(int i=0;i<n;i++) {
		int temp=arr[arr.length-1];
		for (int j = arr.length-1; j >0; j--) {
			arr[j] = arr[j - 1];
		}
		arr[0] = temp;
		}
	System.out.println(Arrays.toString(arr));
	}
}
