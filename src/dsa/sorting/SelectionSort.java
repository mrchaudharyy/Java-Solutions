package dsa.sorting;

import java.util.Arrays;

// traverse from left to right and replace new minimum value to current value
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 17, 20, 0, 15 };
		System.out.println(Arrays.toString(sortElement(arr)));

	}

	public static int[] sortElement(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int minimum = i; // set minimum to current index and compare with entire array
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minimum]) { // if any of the element is small then make it minimum and the cycle repeats
					minimum = j;
				}
			}
			int temp = arr[i]; // swapping current minimum to previous minimum
			arr[i] = arr[minimum];
			arr[minimum] = temp;
		}

		return arr;
	}

}
