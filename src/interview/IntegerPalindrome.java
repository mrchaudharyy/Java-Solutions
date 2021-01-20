package interview;

//sequence of characters which reads the same backward as forward.
public class IntegerPalindrome {

	public static void main(String[] args) {
		IntegerPalindrome obj = new IntegerPalindrome();
		System.out.println(obj.integerPalindrome(8989777));
	}

	public boolean integerPalindrome(int num) {

		int reverseInteger = 0;
		int lastDigit;

		while (num != 0) {
			lastDigit = num % 10;
			reverseInteger = reverseInteger * 10 + lastDigit;
			num /= 10;
		}
		System.out.println(reverseInteger);
		if (num == reverseInteger) {
			return true;
		}

		return false;
	}

}
