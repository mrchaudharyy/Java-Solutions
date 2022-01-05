package array;

import java.util.Arrays;

public class ReverseArrayInPlace {

	public static void main(String[] args) {
		int arr[] = { 4, 2, 3, 1, 8, 9, 30, 12, 7 };
		System.out.println(Arrays.toString(reverseArray(arr)));
	}

	private static int[] reverseArray(int[] arr) {
		int end = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (i == end || i > end) { // if mid point is countered(only one element or i exceeds the mid then break.
				break;
			}
			int temp = arr[i];
			arr[i] = arr[end];
			arr[end] = temp;
			end--;

		}
		return arr;
	}

}
