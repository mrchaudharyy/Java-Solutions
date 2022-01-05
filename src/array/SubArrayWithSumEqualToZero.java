package array;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithSumEqualToZero {

	public static void main(String[] args) {
		int arr[] = { 4, 2, -8, 1, 6 };
		System.out.println(getResult(arr));
	}

	private static boolean getResult(int[] arr) {
		Set<Integer> hs = new HashSet<>();

		int sum = 0;
 		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			// if sum is seen before or sum is ZERO or element itself is ZERO then return TRUE
			if (arr[i] == 0 || sum == 0 || hs.contains(sum))
				return true;

			hs.add(sum);
		}
		return false;
	}

}
