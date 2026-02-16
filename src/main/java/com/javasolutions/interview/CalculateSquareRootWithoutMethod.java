package com.javasolutions.interview;

public class CalculateSquareRootWithoutMethod {

	public static void main(String[] args) {

		int number = 100;

		System.out.println(Math.sqrt(number));

		System.out.println(squareRoot(number, 0.00001));
		// tolerance limit

	}

	static double squareRoot(double n, double l) {
		// Assuming the sqrt of n as n only
		double x = n;
		double root;
		while (true) {
			root = 0.5 * (x + (n / x));
			if (Math.abs(root - x) < l) {
				break;
			}
			x = root;
		}

		return root;
	}

}
