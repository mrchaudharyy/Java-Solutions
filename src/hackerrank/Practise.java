package hackerrank;

	public class Practise {
	
		public static void main(String args[]) {
			try {
				// code that may raise exception
				int data = 100 / 0;
			} catch (ArithmeticException e) {
				System.out.println("Inside the catch block " + e);
			} catch (Exception e) {
				System.out.println("Inside the catch block " + e);
			} finally {
				System.out.println("Inside the finally block");
			}
			// rest code of the program
			System.out.println("rest of the code...");
		}

//	public static void main(String[] args) {
//
//		String myString = "Hello World";
//
//		// charAt() Example
//		char value1 = myString.charAt(2);
//		System.out.println(value1);
//		// prints :: l
//
//		// codePointAt() Example
//		int value2 = myString.codePointAt(3);
//		System.out.println(value2);
//		// prints :: unicode of char at index 3 i.e 108
//
//		// length() Example
//		int value3 = myString.length();
//		System.out.println(value3);
//		// prints :: unicode of char at index 3 i.e 108
//	}
}
