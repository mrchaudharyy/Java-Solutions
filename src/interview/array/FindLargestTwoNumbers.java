package interview.array;

public class FindLargestTwoNumbers {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 100, 20, 500, 90 };
		findNumbers(arr);
	}

	private static void findNumbers(int arr[]) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int number : arr) {
			if (number > max1) {
				max2 = max1;
				max1 = number;
			} else if (number > max2) {
				max2 = number;
			}
		}
		System.out.println("First Largest " + max1);
		System.out.println("Second Largest " + max2);
	}
}
