package com.javasolutions.demo;

import java.util.ArrayList;
import java.util.Collections;

public class Dem {
    public static void main(String[] args) {

    }

    public int solution(int[] A, int K) {

        if (K > A.length) {
            return -1;
        }
        int maxSum = 0;
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 1) {
                oddList.add(A[i]);
            } else {
                evenList.add(A[i]);
            }
        }
        Collections.sort(oddList);
        Collections.sort(evenList);
        int i = evenList.size() - 1;
        int j = oddList.size() - 1;

        while (K > 0) {
            if (K % 2 == 1) {
                if (i >= 0) {
                    maxSum += evenList.get(i);
                    i--;
                } else {
                    return -1;
                }
                K--;
            } else if (i >= 1 && j >= 1) {
                if (evenList.get(i) + evenList.get(i - 1)
                        <= oddList.get(j) + oddList.get(j - 1)) {
                    maxSum += oddList.get(j) + oddList.get(j - 1);
                    j -= 2;
                } else {
                    maxSum += evenList.get(i) + evenList.get(i - 1);
                    i -= 2;
                }
                K -= 2;
            } else if (i >= 1) {
                maxSum += evenList.get(i) + evenList.get(i - 1);
                i -= 2;
                K -= 2;
            } else if (j >= 1) {
                maxSum += oddList.get(j) + oddList.get(j - 1);
                j -= 2;
                K -= 2;
            }
        }
        return maxSum;
    }
}
