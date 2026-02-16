package com.javasolutions.interview;

//Armstrong number is a number that is equal to the sum of cubes of its digits
public class ArmstrongNumber {

	public static void main(String[] args) {
		ArmstrongNumber obj = new ArmstrongNumber();
		System.out.println(obj.armstrongNumber(370));

	}

	public boolean armstrongNumber(int num) {

		int lastDigit = 0;
		int sum = 0;
		int temp = num;

		while (num > 0) {
			lastDigit = num % 10;
			sum += Math.pow(lastDigit, 3);
			num /= 10;
		}

		if (sum == temp) {
			return true;
		}

		return false;
	}

}
