package dsa.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		// 0 1 2 3 4 5 6 7

		System.out.println(findNumber(arr, 6));
		System.out.println(searchWithRecursion(arr, 0, arr.length - 1, 6));

	}

	public static int findNumber(int[] arr, int num) {

		int first = 0;
		int last = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {
			int mid = (first + last) / 2;
			if (num > arr[mid]) {
				first = mid + 1;
			} else if (num < arr[mid]) {
				last = mid - 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

	public static int searchWithRecursion(int[] arr, int first, int last, int num) {
		if (first > last) {
			return -1;
		} else {
			int mid = (first + last) / 2;
			if (arr[mid] == num) {
				return mid;
			} else if (num > arr[mid]) {
				return searchWithRecursion(arr, mid + 1, last, num);
			} else {
				return searchWithRecursion(arr, first, mid - 1, num);
			}
		}
	}

}
