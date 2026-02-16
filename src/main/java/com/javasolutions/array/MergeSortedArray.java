package com.javasolutions.array;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30 };
		int arr1[] = { 1, 5, 8, 12, 18 };
		System.out.println(Arrays.toString(mergeArray(arr, arr1)));
	}

	private static int[] mergeArray(int[] arr, int arr1[]) {
		int[] mergedArray = new int[arr.length + arr1.length];

		int i = 0, j = 0, k = 0;

		while (i < arr.length && j < arr1.length) {
			if (arr[i] < arr1[j]) {
				mergedArray[k] = arr[i];
				i++;
			} else {
				mergedArray[k] = arr1[j];
				j++;
			}
			k++;
		}

		while (i < arr.length) {
			mergedArray[k] = arr[i];
			i++;
			k++;
		}

		while (j < arr1.length) {
			mergedArray[k] = arr1[j];
			j++;
			k++;
		}

		return mergedArray;
	}

}
