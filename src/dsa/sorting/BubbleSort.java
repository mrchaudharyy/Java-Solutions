package dsa.sorting;

/* Performs sorting by repeatedly moving the largest element to the highest index of the array. 
It comprises of comparing each element to its adjacent element and replace them accordingly. */
public class BubbleSort {

	public static void main(String[] args) {
		int[] intArray = { 10, 9, 7, 101, 23, 44, 12, 78, 34, -1 };
		int end = intArray.length;

		// Effective Approach

		for (int i = end - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (intArray[j] > intArray[j + 1]) {
					int temp = intArray[j + 1];
					intArray[j + 1] = intArray[j];
					intArray[j] = temp;
				}
			}
		}

		// Ineffective approach

/*
		for (int i = 0; i < end; i++) {
			for (int j = 0; j < end; j++) {
				if (intArray[i] < intArray[j]) {
					int temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
*/

		System.out.println("Printing Sorted List ...");
		for (int i = 0; i < end; i++) {
			System.out.print(intArray[i] + " ");
		}

	}

}
