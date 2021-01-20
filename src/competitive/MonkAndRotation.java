package competitive;

import java.util.Scanner;

// rotate the array in the right direction by K steps
public class MonkAndRotation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter No Of Element :: ");
		int noOfElement = scanner.nextInt();
		System.out.println("Enter No Of Steps :: ");
		int noOfSteps = scanner.nextInt();
		System.out.println("Enter array :: ");
		int[] arr = new int[noOfElement];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();

		for (int i = 0; i < noOfSteps; i++) {
			int last = arr[arr.length - 1];
			for (int j = arr.length - 2; j >= 0; j--) {
				arr[j + 1] = arr[j];
			}
			arr[0] = last;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
// input [ 1 2 3 4 5 ]
// output [ 4 5 1 2 3 ] 
