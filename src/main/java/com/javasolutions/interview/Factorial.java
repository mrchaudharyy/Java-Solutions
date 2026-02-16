package com.javasolutions.interview;

public class Factorial {

	public static void main(String[] args) {
		Factorial obj = new Factorial();
		System.out.println(obj.getFactorial(5));
	}

	public int getFactorial(int number) {

		if (number == 0) {
			return 1;
		}
		return number * getFactorial(number - 1);
	}

}
