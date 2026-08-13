package assignment;

public class Unique {
		public static void main(String[] args) {
			int[] arr = { 12, 13, 15, 12, 13, 17 };
			for (int i = 0; i < arr.length; i++) {
				boolean isUniq = false;
				for (int k = 0; k < i; k++) {
					if (arr[i] == arr[k]) {
						isUniq = true;
						break;
					}
				}
				if (isUniq)
					continue;
				int count = 0;
				for (int j = 0; j < arr.length; j++) {
					if (arr[i] == arr[j])
						count++;
				}
				if (count == 1) {
					System.out.println(arr[i]);
				}
			}
		}
	}

