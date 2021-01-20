package interview.string;

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

}
