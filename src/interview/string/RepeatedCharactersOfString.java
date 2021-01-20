package interview.string;

import java.util.HashSet;
import java.util.Set;

public class RepeatedCharactersOfString {

	public static void main(String[] args) {
		System.out.println(getRepeatedChar("shubham chaudhary"));
	}

	private static String getRepeatedChar(String s) {

		Set<String> uniqueCharSet = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			String currentCharacter = String.valueOf(s.charAt(i));
			if (!uniqueCharSet.contains(currentCharacter)) {
				uniqueCharSet.add(currentCharacter);
			} else {
				System.out.println("Char-> " + currentCharacter + " <- already exists");
			}
		}
		return " ";
	}

}
