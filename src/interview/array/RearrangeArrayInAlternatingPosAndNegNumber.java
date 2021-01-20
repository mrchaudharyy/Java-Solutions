package interview.array;

import java.util.Arrays;

public class RearrangeArrayInAlternatingPosAndNegNumber {

	public static void main(String[] args) {
		int arr[] = { 1, -2, 3, -4, -1, 4 };
		getArray(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void reArrange(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (right > left) {
			while (arr[left] < 0 && left < right)
				left++;
			while (arr[right] > 0 && left < right)
				right--;
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
	}

	private static void getArray(int[] arr) {
		reArrange(arr);
		int left = 1;
		int firstPositive = 0;
		while (arr[firstPositive] < 0)
			firstPositive++;
		int right = firstPositive;
		while (arr[left] < 0 && right < arr.length) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left = left + 2;
			right++;
		}

	}

}
