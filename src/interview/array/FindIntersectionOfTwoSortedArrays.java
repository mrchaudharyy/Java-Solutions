package interview.array;

public class FindIntersectionOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = { 21, 34, 41, 22, 35 };
		int[] arr2 = { 61, 34, 45, 21, 11 };
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
