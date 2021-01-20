package interview;

// A leap year is exactly divisible by 4 except for century years (years ending with 00). 
// The century year is a leap year only if it is perfectly divisible by 400.
public class LeapYear {

	public static void main(String[] args) {
		int year = 1900;
		boolean leap = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				// year is divisible by 400, hence the year is a leap year
				if (year % 400 == 0) {
					leap = true;
				} else {
					leap = false;
				}
			} else {
				leap = true;
			}
		} else {
			leap = false;
		}

		if (leap)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");

	}

}
