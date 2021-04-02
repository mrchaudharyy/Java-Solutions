package dsa.sorting;

/* Merge sort follows divide and conquer approach
 where in we first divide the problem into sub problems.
 When the solutions for the sub problems are ready, we combine them together to get the final solution to the problem.*/
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {-11, 2, 8, 1, 0, -55, 101};
        sort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void sort(int[] arr, int first, int last) {
        if (first >= last) { // confirm at least we have 2 elements to sort
            return;
        }
        int mid = (first + last) / 2; // find the mid element
        sort(arr, first, mid); // sort the left partition
        sort(arr, mid + 1, last); // sort the right partition
        merge(arr, first, mid, last); // merge both partitions

    }

    private static void merge(int[] arr, int first, int mid, int last) {
        if (arr[mid] <= arr[mid + 1]) { // here we've left and right partition sorted. If last element of left partition is smaller than the first element of the right partition then no need to do anything.
            return;
        }

        int[] tempArray = new int[last - first + 1]; // get a new temp array here to save merged values.
        int k = 0;

        int firstLeftSlot = first; // take first position in left partition
        int firstRightSlot = mid + 1; // take first position in right partition

        while (firstLeftSlot <= mid && firstRightSlot <= last) { // run until all elements are merged.
            tempArray[k++] = arr[firstLeftSlot] <= arr[firstRightSlot] ? arr[firstLeftSlot++] : arr[firstRightSlot++];
            // copy to temp array if value of first element of left partition is smaller than value of
            // first element in right partition.
        }

        //find if some elements are left in left slot and merge them
        while (firstLeftSlot <= mid) {
            tempArray[k++] = arr[firstLeftSlot++];
        }

        //find if some elements are left in right slot and merge them
        while (firstRightSlot <= last) {
            tempArray[k++] = arr[firstRightSlot++];
        }

        // copy temp array to original array.
        k = 0;
        for (int i = first; i <= last; i++) {
            arr[i] = tempArray[k++];
        }

    }

}
