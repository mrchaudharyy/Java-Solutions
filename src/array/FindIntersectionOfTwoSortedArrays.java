package array;

public class FindIntersectionOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = { 21, 29, 34, 41, 56 };
		int[] arr2 = { 32, 38, 41, 56, 66 };
		StringBuilder intersect = new StringBuilder();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					intersect.append(arr1[i] + " ");
				}
			}
		}
		System.out.println("[" + intersect + "]");
	}

}
