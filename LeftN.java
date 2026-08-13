package assignment;
import java.util.*;
public class LeftN {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int n=1;
		for(int i=1;i<=n;i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = 0;
		}
		System.out.println(Arrays.toString(arr));
	}

}
