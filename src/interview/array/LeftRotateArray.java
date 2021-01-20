package interview.array;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArray {
	
	static int[] rotLeft(int[] arr, int noOfSteps) {
		for (int i = 0; i < noOfSteps; i++) {
			int first = arr[0];
			for (int j = 0; j <= arr.length - 2; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = first;
		}
		return arr;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String[] nd = scanner.nextLine().split(" ");

		int noOfElements = Integer.parseInt(nd[0]);

		int noOfSteps = Integer.parseInt(nd[1]);

		int[] arr = new int[noOfElements];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < noOfElements; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			arr[i] = aItem;
		}

		int[] result = rotLeft(arr, noOfSteps);

		System.out.println(Arrays.toString(result));
		scanner.close();
	}
}
