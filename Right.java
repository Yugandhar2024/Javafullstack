package assignment;
import java.util.*;
public class Right {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		for (int i = arr.length-1; i >0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = 0;

//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
	System.out.println(Arrays.toString(arr));	
	}
}
