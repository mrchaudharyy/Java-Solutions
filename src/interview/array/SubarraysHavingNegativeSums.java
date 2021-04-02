package interview.array;

import java.util.Scanner;

/*
 * An array's sum is negative if the total sum of its elements is negative
 * Sample Input : 
 * 5 
 * 1 -2 4 -5 1
 * 
 * Sample Output:
 * 9
 * 
*/

public class  SubarraysHavingNegativeSums {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter no of elements");

		int noOfElements = scanner.nextInt();

		int[] arr = new int[noOfElements];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		scanner.close();
		int n = arr.length;
		int sum = 0;
		int total = 0;
		for (int i = 0; i < n; i++) // This loop will select start element
		{
			for (int j = i; j < n; j++) // This loop will select end element
			{
				for (int k = i; k <= j; k++) // This loop will print element from start to end
				{
					sum += arr[k];
				}
				if (sum < 0) {
					total++;
				}
				sum = 0;				
			}
		}
		System.out.println(total);
	}

}
