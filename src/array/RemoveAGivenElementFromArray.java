package array;

import java.util.Arrays;

// need to understand first before publishing - extra 8 is appearing
public class RemoveAGivenElementFromArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(Arrays.toString(removeElement(arr, 2)));
		System.out.println(Arrays.toString(removeElementUsingNewArray(arr, 2)));
	}

	private static int[] removeElement(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				while (i < arr.length - 1) {
					arr[i] = arr[i + 1];
					i++;
				}
			}
		}
		return arr;
	}

	private static int[] removeElementUsingNewArray(int[] arr, int k) {
		int count = 0;
		int[] newArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != k) {
				newArray[count++] = arr[i];
			}
		}
		return newArray;
	}
}
