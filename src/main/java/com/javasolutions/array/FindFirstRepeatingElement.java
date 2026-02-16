package com.javasolutions.array;

import java.util.ArrayList;
import java.util.List;

public class FindFirstRepeatingElement {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 10, 10, 50, 50 };
		findCommonElements(arr);
	}

	private static void findCommonElements(int arr[]) {
		List<Integer> element = new ArrayList<Integer>();
		for (int i : arr) {
			if (!element.contains(i)) {
				element.add(i);
			} else {
				System.out.println(i);
				break;
			}
		}

	}

}
