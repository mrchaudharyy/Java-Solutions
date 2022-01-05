package array;

public class FindMissingNumberFromIntegerArray {

	public static void main(String[] args) {
		FindMissingNumberFromIntegerArray obj = new FindMissingNumberFromIntegerArray();
		int arr[] = { 1, 2, 3, 4, 6, 7, 9, 8, 10, 11, 12, 13, 14, 15 };
		System.out.println(obj.findMissing(arr, 15));
	}

	public int findMissing(int[] arr, int num) {

		int expectedSum = num * (num + 1) / 2;
		int actualSum = 0;

		for (int i = 0; i < arr.length; i++) {
			actualSum += arr[i];
		}

		return expectedSum - actualSum;
	}

}
