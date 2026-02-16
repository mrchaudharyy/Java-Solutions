package com.javasolutions.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int arr[] = { 5, 6, 1, 2, 2, 4, 5, 3 };
		RemoveDuplicatesFromArray obj = new RemoveDuplicatesFromArray();
		obj.removeDuplicatesUsingSet(arr);

	}

	public void removeDuplicatesUsingSet(int[] arr) {

		Set<Integer> obj = new HashSet<>();

		for (int i : arr) {
			obj.add(i);
		}
		
		System.out.println(obj);

	}
}
