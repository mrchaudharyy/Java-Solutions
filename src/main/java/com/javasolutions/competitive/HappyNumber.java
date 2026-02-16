package com.javasolutions.competitive;
import java.util.HashSet;

// a happy number is a number which eventually reaches 1 when replaced by the sum of the square of each digit. 
public class HappyNumber {

	public static void main(String[] args) {

		HappyNumber obj = new HappyNumber();
		System.out.println(obj.isHappy(19));
	}

	public boolean isHappy(int n) {

		HashSet<Integer> set = new HashSet<Integer>();

		while (!set.contains(n)) {
			set.add(n);
			n = getSum(n);
			if (n == 1)
				return true;
		}
		return false;
	}

	public int getSum(int n) {
		int sum = 0;
		while (n > 0) {
			sum += (n % 10) * (n % 10);
			n /= 10;
		}
		return sum;
	}
}
