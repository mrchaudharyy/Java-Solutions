package dsa.sorting;

/* Merge sort follows divide and conquer approach
 where in we first divide the problem into subproblems. 
 When the solutions for the subproblems are ready, we combine them together to get the final solution to the problem.*/
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 17, 20, 0, 15, 31, 89 };
		sort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void sort(int[] arr, int first, int last) {

		if (first < last) { // check whether have at least two elements
			int mid = (first + last) / 2; // calculate the mid
			sort(arr, first, mid); // call recursively and divide into two half ( this would be first half)
			sort(arr, mid + 1, last); // call recursively ( this would be second half)
			merge(arr, first, mid, last); // merge both portions
		}
	}

	private static void merge(int[] arr, int first, int mid, int last) {
		int[] tempArray = new int[last - first + 1]; // define temp array
		// now we have two slots because array is sorted up to single element.
		int firstLeftSlot = first; // declare first index of firstSlot
		int firstRightSlot = mid + 1; // declare first index of seconfSlot
		int k = 0;
		while (firstLeftSlot <= mid && firstRightSlot <= last) { // check until all is merged.

			if (arr[firstLeftSlot] < arr[firstRightSlot]) { // if leftSlot element is less then rightSlot element
				tempArray[k] = arr[firstLeftSlot]; // add that element into temp array.
				firstLeftSlot++; // increment left first slot by 1 because previous element is already compared.
			} else {
				tempArray[k] = arr[firstRightSlot]; // if is greater then add right slot element into temp variable.
				firstRightSlot++;
			}
			k++;
		}
		if (firstLeftSlot > mid) { // if some elements are left inside right slot and left slot is all merged.
			while (firstRightSlot <= last) { // iterate all right slot element
				tempArray[k] = arr[firstRightSlot]; // and add to the temp array
				firstRightSlot++;
				k++;
			}
		} else { // if some elements are left inside left slot and right slot is all merged.
			while (firstLeftSlot <= mid) { // iterate all over the left slot
				tempArray[k] = arr[firstLeftSlot]; // and add to the temp array
				firstLeftSlot++;
				k++;
			}
		}

		for (int i = 0; i < tempArray.length; i++) {
			arr[first + i] = tempArray[i]; // finally copy all temp array variables to original array.
		}

	}

}
