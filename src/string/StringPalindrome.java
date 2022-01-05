package string;

//sequence of characters which reads the same backward as forward.
public class StringPalindrome {

	public static void main(String[] args) {
		StringPalindrome obj = new StringPalindrome();
		System.out.println(obj.stringPalindrome("obo"));
	}

	public boolean stringPalindrome(String text) {
		
		String reverseString = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			reverseString += text.charAt(i);
		}
		if(text.equals(reverseString)) {
			return true;
		}

		return false;
	}

	// another easy way
	public boolean isPalindrome(String s) {

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
