package interview.array;

public class FindLargestAndSmallestNumberInUnsortedArray {

	public static void main(String[] args) {
		int unSortedArray[] = { 0, 1, 8, 4, 9, 20, 44, 7, 0 };
		findNumbers(unSortedArray);
	}

	private static void findNumbers(int arr[]) {
		int largest = arr[0]; // assuming first element as largest
		int smallest = arr[0]; // assuming first element as smallest
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) { // comparing all elements
				largest = arr[i]; // if greater make it new largest
			} else if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Largest Number is :: " + largest);
		System.out.println("Smallest Number is :: " + smallest);
	}

}
