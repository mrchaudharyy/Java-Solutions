package interview.string;

import java.util.Arrays;

// A string is said to be an anagram if it contains the same characters and same length, but in a different order.
public class StringAnagram {

	public static void main(String[] args) {
		String word = "Stressed";
		String word1 = "Desserts";

		System.out.println(checkAnagram(word, word1));
		System.out.println(checkAnagramBySorting(word, word1));
	}

	private static boolean checkAnagram(String word, String word1) {
		if (word.length() == word1.length()) {
			for (int i = 0; i < word.length(); i++) {
				if (!word1.toLowerCase().contains(String.valueOf(word.charAt(i)).toLowerCase())) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	private static boolean checkAnagramBySorting(String word, String word1) {
		// convert strings to char array
		char[] charArray1 = word.toLowerCase().toCharArray();
		char[] charArray2 = word1.toLowerCase().toCharArray();

		// sort the char array
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);

	}

}
