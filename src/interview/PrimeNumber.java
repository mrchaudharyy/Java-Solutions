package interview;

//numbers that have only 2 factors: 1 and themselves
public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumber obj = new PrimeNumber();
		System.out.println(obj.primeOrNot(2));
	}

	public boolean primeOrNot(int number) {

		boolean isPrime = true;

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			return true;
		}

		return false;
	}

}