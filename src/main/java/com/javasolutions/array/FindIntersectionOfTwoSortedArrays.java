package com.javasolutions.array;

public class FindIntersectionOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {10, 11, 12, 13, 14};
        int[] arr2 = {8, 10, 12, 14};
        StringBuilder intersect = new StringBuilder();

        // Approach #1
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    intersect.append(arr1[i] + " ");
                }
            }
        }

/**
 // Approach #2
 int i = 0, j = 0;
 while (i < arr1.length && j < arr2.length) {
 if (arr1[i] == arr2[j]) {
 intersect.append(arr1[i] + " ");
 i++; j++;
 }
 else if(arr1[i] < arr2[j]){
 i++;
 }
 else{
 j++;
 }
 }

 */
        System.out.println("[" + intersect + "]");
    }

}
