package array;

public class MinimumDistanceBetweenTwoNumbers {
    int minDist(int arr[], int x, int y) {

        //previous index and min distance
        int p = -1, min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x || arr[i] == y) {

                // check if p is not equal to -1
                // check if element at index and p are not equal
                // this way we can find minimum distance in both direction.
                if (p != -1 && arr[i] != arr[p]) {
                    min = Math.min(min, i - p); // find minimum
                }
                //update the previous index
                p = i;
            }
        }
        //If distance is equal to int max
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    public static void main(String[] args) {
        MinimumDistanceBetweenTwoNumbers min = new MinimumDistanceBetweenTwoNumbers();
        int arr[] = {4, 5, 4, 6, 3, 5, 6, 8, 1};
        int x = 3;
        int y = 8;

        System.out.println("Minimum distance between " + x + " and " + y
                + " is " + min.minDist(arr, x, y));
    }
}
