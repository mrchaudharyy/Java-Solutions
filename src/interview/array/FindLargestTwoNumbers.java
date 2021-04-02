package interview.array;

public class FindLargestTwoNumbers {

    public static void main(String[] args) {
        int arr[] = {10, 5, 10};
        findNumbers(arr);
    }

    private static void findNumbers(int arr[]) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int number : arr) {
            if (number > first) {
                second = first;
                first = number;
            } else if (number > second && number != first) {
                second = number;
            }
        }
        System.out.println("First Largest " + first);
        if (second == Integer.MIN_VALUE) {
            System.out.println("Second Largest not found");
        } else {
            System.out.println("Second Largest " + second);
        }
    }
}
