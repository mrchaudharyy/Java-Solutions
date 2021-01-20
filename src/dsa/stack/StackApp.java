package dsa.stack;

public class StackApp {

	public static void main(String[] args) {
		StackImpl stackImpl = new StackImpl(4);
		stackImpl.push(10);
		stackImpl.push(20);
		stackImpl.push(30);
		stackImpl.push(40);

		System.out.println(stackImpl.pop());

		System.out.println("Peak Element " + stackImpl.peak());

//		System.out.println(reverseString("Shubham"));
	}

	public static String reverseString(String value) {
		int end = value.length();
		ReverseStringUsingStack stackImpl = new ReverseStringUsingStack(end);
		for (int i = 0; i < end; i++) {
			stackImpl.push(value.charAt(i));
		}
		
		String result = "";
		while(!stackImpl.isEmpty()) {
			char val = stackImpl.pop();
			result += val;
		}
		
		return result;
	}

}
