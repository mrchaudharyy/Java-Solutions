package dsa.sorting;

/* Performs sorting by repeatedly moving the largest element to the highest index of the array. 
It comprises of comparing each element to its adjacent element and replace them accordingly. */
public class BubbleSort {

	public static void main(String[] args) {
		int[] a = { 10, 9, 7, 101, 23, 44, 12, 78, 34, 23 };
		int end = a.length;
		for (int i = 0; i < end; i++) {
			for (int j = 0; j < end; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Printing Sorted List ...");
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
