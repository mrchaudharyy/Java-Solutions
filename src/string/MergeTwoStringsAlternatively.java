package string;

import java.util.Scanner;

public class MergeTwoStringsAlternatively {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        scanner.nextLine();
        while (input > 0) {
            String[] strArray = scanner.nextLine().split(" ");
            mergeStrings(strArray[0], strArray[1]);
            input--;
        }
    }

    private static void mergeStrings(String one, String two) {
        String result = "";
        for (int i = 0; i < one.length() | i < two.length(); i++) {
            if (i < one.length())
                result += one.charAt(i);
            if (i < two.length())
                result += two.charAt(i);
        }
        System.out.println(result);
    }
}
