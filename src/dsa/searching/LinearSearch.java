package dsa.searching;

public class LinearSearch {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		System.out.println(searchWithRecursion(arr, 0, 4));
	}

	public static int findNumber(int[] arr, int num) {

		int last = arr.length;

		for (int i = 0; i < last; i++) {
			if (arr[i] == num) {
				return i;
			}
		}

		return -1;
	}

	public static int searchWithRecursion(int[] arr, int indexPos, int num) {
		if (indexPos > arr.length - 1) { // if not found in array
			return -1;
		} else if (arr[indexPos] == num) {
			return indexPos;
		} else {
			return searchWithRecursion(arr, indexPos + 1, num);
		}
	}
}
