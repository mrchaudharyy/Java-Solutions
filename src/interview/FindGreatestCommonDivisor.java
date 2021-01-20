package interview;

public class FindGreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println(findGCDWithRecursion(7, 11));
		System.out.println(getGcd(7, 11));
	}

	private static int findGCDWithRecursion(int number1, int number2) {
		if (number2 == 0) {
			return number1;
		}
		return findGCDWithRecursion(number2, number1 % number2);
	}

	private static int getGcd(int num1, int num2) {

		int greatest = 0;

		for (int i = 1; i <= num1 / 2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				greatest = i;
			}
		}

		return greatest;
	}
}
