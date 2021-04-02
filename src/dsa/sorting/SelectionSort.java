package dsa.sorting;

import java.util.Arrays;

// traverse from left to right and replace new minimum value to current value
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 5,4,3,1,2 };
		System.out.println(Arrays.toString(sortElement(arr)));
	}

	public static int[] sortElement(int[] arr) {

		for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) { // start from last (let it be unsorted array)
			int largest = 0; // assume first element to be largest
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (arr[i] > arr[largest]) { // find if any other element is largest
					largest = i; // make it largest
				}
			}
			// swap largest element to the last index here
			// this way, largest element will start moving to the end of the array
			int temp = arr[largest];
			arr[largest] = arr[lastUnsortedIndex];
			arr[lastUnsortedIndex] = temp;
		}

		return arr;
	}

}
