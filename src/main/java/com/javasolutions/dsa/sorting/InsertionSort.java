package com.javasolutions.dsa.sorting;

import java.util.Arrays;

// divide array in sorted and unsorted part. pull element from unsorted part and move it to sorted part.
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 17, 20, 0, 15 };
		System.out.println(Arrays.toString(sortElement(arr)));

	}

	private static int[] sortElement(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int unsorted = arr[i]; // store first element of unsorted array in a variable
			int sorted = i - 1; // set last element of sorted array {adjacent to unsorted array)
			while (sorted >= 0 && arr[sorted] > unsorted) { // check if index is not less than ZERO && check if element of sorted portion is greater than element of unsorted portion
				arr[sorted + 1] = arr[sorted]; // replace first element of unsorted portion from greater element in sorted portion;
				sorted--; // decrement index to check is there any greater element in sorted portion. 
			}
			arr[sorted + 1] = unsorted; // set element
		}

//		for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
//			int newElement = arr[firstUnsortedIndex];
//			int i;
//
//			for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
//				arr[i] = arr[i - 1];
//			}
//			arr[i] = newElement;
//		}
		return arr;
	}

}