package practiceStringWithoutJava8;

import java.util.Arrays;

public class SortStringChar {

	public static void main(String[] args) {

		String str = "vivek";
		char[] array = str.toCharArray();
		char temp;

		// Approach - 1 (without using sort method)

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(new String(array));

		// Approach - 2 (using sort() method)

		String str1 = "bhola";
		char[] arr = str1.toCharArray();
		Arrays.sort(arr);
		System.out.println(new String(arr));
	}

}
