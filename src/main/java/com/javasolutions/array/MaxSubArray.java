package com.javasolutions.array;

import java.util.ArrayList;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, -7, 2, 3};
        System.out.println(findSubArray(a));

    }

    static ArrayList<Integer> findSubArray(int a[]) {
        long maxSum = 0;
        long newSum = 0;
        ArrayList<Integer> maxArray = new ArrayList<>();
        ArrayList<Integer> newArray = new ArrayList<>();
        for (Integer i : a) {
            if (i >= 0) {
                newSum += i;
                newArray.add(i);
            } else {
                newSum = 0;
                newArray = new ArrayList<>();
            }
            if ((maxSum < newSum) || ((maxSum == newSum) && (newArray.size() > maxArray.size()))) {
                maxSum = newSum;
                maxArray = newArray;
            }
        }
        if (maxArray.size() == 0) {
            maxArray.add(-1);
            return maxArray;
        }
        return maxArray;
    }
}
