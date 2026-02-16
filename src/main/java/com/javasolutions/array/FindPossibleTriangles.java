package com.javasolutions.array;

import java.util.Arrays;

public class FindPossibleTriangles {

    public static void main(String[] args) {
        int[] arr = {4, 3, 9, 8};
        int numberOfTriangles = findNumberOfTriangles(arr, arr.length);
        System.out.println("Possible triangles :: " + numberOfTriangles);
    }

    // Effective approach
    static int findNumberOfTriangles(int arr[], int n) {
        int count = 0;

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            int left = 0;
            int right = i - 1;

            while (left < right) {
                if (arr[left] + arr[right] > arr[i]) {
                    count += (right - left);
                    right--;
                } else {
                    left++;
                }
            }
        }

        return count;

    }

    // Ineffective approach
    static int findNumberOfTriangles1(int arr[], int n) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] > arr[k]
                            && arr[i] + arr[k] > arr[j]
                            && arr[k] + arr[j] > arr[i]) {
                        count++;
                        System.out.println("Set : " + count + " : " + arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }

        return count;
    }
}
