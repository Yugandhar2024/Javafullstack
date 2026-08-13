package assignment;

public class First {
	public static int lastDig(int n) {
		return n % 10;
	}

	public static int firstDig(int n) {
		while (n > 9) 
			n = n / 10;
		return n;
	}

	public static void main(String[] args) {
		int[] arr = {121, 120, 42, 22, 13};
		for (int i = 0; i < arr.length; i++) {
			if (firstDig(arr[i]) == lastDig(arr[i]))
				System.out.println(arr[i]);
		}
	}
}