package interview.array;

public class FindCommonElementsInMultipleSortedArray {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 10, 20, 40, 80 };
		int arr1[] = { 6, 7, 20, 80, 100 };
		int arr2[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
		findCommonElements(arr, arr1, arr2);
	}

	private static void findCommonElements(int arr[], int arr1[], int arr2[]) {
		int i = 0, j = 0, k = 0;

		while (i < arr.length && j < arr1.length && k < arr2.length) {

			if (arr[i] == arr1[j] && arr1[j] == arr2[k]) {
				System.out.print(arr[i] + " ");
				i++; j++; k++;
			} else if (arr[i] < arr1[j]) {
				i++;
			} else if (arr1[j] < arr2[k]) {
				j++;
			} else {
				k++;
			}
		}
	}

}
