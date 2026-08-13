package assignment;
import java.util.*;
public class Negative {
	public static void main(String[] args) {
		int[] arr= {7,6,-1,3,-1,1,-6,8};
		System.out.println(Arrays.toString(arr));
		
		int[] temp = new int[arr.length]; 
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				temp[index] = arr[i];
				index++;
			}
		}
		
		// then copy all negative numbers
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				temp[index] = arr[i];
				index++;
			}
		}
		
		System.out.println(Arrays.toString(temp));
	}
}