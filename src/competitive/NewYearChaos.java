package competitive;

import java.util.Arrays;
import java.util.Scanner;

public class NewYearChaos {


    static int totalBribe = 0;
    static int maxBribe = 2;

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {

        int ans = 0;
        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q[i] - 2); j < i; j++)
                if (q[j] > q[i]) ans++;
        }
        System.out.println(ans);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int noOfPeople = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] queue = new int[noOfPeople];

        String[] qItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < noOfPeople; i++) {
            int qItem = Integer.parseInt(qItems[i]);
            queue[i] = qItem;
        }

        minimumBribes(queue);

        scanner.close();
    }
}

