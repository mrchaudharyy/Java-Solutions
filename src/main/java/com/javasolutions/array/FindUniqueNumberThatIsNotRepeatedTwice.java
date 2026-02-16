package com.javasolutions.array;

import java.util.ArrayList;
import java.util.List;

public class FindUniqueNumberThatIsNotRepeatedTwice {

	public static void main(String[] args) {
		int unSortedArray[] = { 1, 1, 3, 3, 2, 5, 5, 6, 6 };
		findNumber(unSortedArray);
	}

	private static void findNumber(int arr[]) {
		List<Integer> elements = new ArrayList<>();
		for (int i : arr) {
			if (!elements.contains(i)) {
				elements.add(i);
			} else {
				elements.remove(Integer.valueOf(i));
			}
		}
		System.out.println(elements.get(0));
	}

}
