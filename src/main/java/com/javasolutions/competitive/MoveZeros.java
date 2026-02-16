package com.javasolutions.competitive;

/** 
 
Given an array nums, write a function to move all 0's to the 
 
end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operation

*/

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {

		int[] nums = { 3, 0, 1, 0, 0, 1 };
		MoveZeros obj = new MoveZeros();
		System.out.println(Arrays.toString(obj.moveZeroesApp2(nums)));

	}

	public int[] moveZeroes(int[] nums) {

		int count = 0;
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			if (nums[i] != 0) {
				nums[count++] = nums[i];
			}
		}

		while (count < length) {
			nums[count++] = 0;
		}
		return nums;
	}

	public int[] moveZeroesApp2(int[] nums) {

		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[i];
				nums[i] = nums[counter];
				nums[counter] = temp;
				counter++;
			}
		}

		return nums;
	}
}
