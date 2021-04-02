package interview.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class CheckStringBalancedParentheses {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		System.out.println(validate(input));
		scan.close();
	}

	private static boolean validate(String input) {
		Stack<Character> stack = new Stack<>();
		Map<Character, Character> map = new HashMap<>();
		map.put('{', '}');
		map.put('(', ')');
		map.put('[', ']');

		if (input.length() % 2 != 0) {
			return false;
		}
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (map.containsKey(c)) {
				stack.push(c);
			} else if (stack.isEmpty() || c != map.get(stack.pop())) {
				return false;
			}
		}

		return stack.isEmpty() ? true : false;
	}
}
