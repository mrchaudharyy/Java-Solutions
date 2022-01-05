package array;

public class CheckIfArrayContainsANumber {

	public static void main(String[] args) {
		int sortedArray[] = { 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		int unSortedArray[] = { 13, 1, 8, 4, 9, 20, 44, 7, 3 };
		System.out.println(checkNumber(unSortedArray, 3));
		System.out.println(checkNumberWithBinarySearch(sortedArray, 0, sortedArray.length - 1, 15)); // only if array is
																										// sorted.

	}

	private static boolean checkNumber(int[] arr, int num) {

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == num) {
				return true;
			}
		}

		return false;
	}

	// only if array is sorted.
	private static boolean checkNumberWithBinarySearch(int[] arr, int first, int last, int num) {

		for (int i = first; i <= last; i++) {
			int mid = (first + last) / 2;
			if (arr[i] == num) {
				return true;
			} else if (arr[i] < arr[mid]) {
				checkNumberWithBinarySearch(arr, first, mid - 1, num);
			} else if (arr[i] > arr[mid]) {
				checkNumberWithBinarySearch(arr, mid + 1, last, num);
			}
		}

		return false;
	}

}
