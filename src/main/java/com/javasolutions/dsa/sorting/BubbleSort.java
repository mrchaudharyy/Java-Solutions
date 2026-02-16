package com.javasolutions.dsa.sorting;

/* Performs sorting by repeatedly moving the largest element to the highest index of the array. 
It comprises comparing each element to its adjacent element and replace them accordingly. */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {10, 9, 7, 101, 23, 44, 12, 78, 34, -1};
        int end = arr.length;

        // Effective Approach

/**        for (int i = end - 1; i > 0; i--) {
 for (int j = 0; j < i; j++) {
 if (arr[j] > arr[j + 1]) {
 int temp = arr[j + 1];
 arr[j + 1] = arr[j];
 arr[j] = temp;
 }
 }
 }
 */

        for (int i = 0; i < end - 1; i++) {
            for (int j = 0; j < end - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Ineffective approach
/**
 for (int i = 0; i < end; i++) {
 for (int j = 0; j < end; j++) {
 if (arr[i] < arr[j]) {
 int temp = arr[i];
 arr[i] = arr[j];
 arr[j] = temp;
 }
 }
 }
 */

        System.out.println("Printing Sorted List ...");
        for (int i = 0; i < end; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
