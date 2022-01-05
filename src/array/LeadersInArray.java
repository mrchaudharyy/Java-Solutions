package array;

import java.util.ArrayList;
import java.util.List;

/**
Given an array A of positive integers. Your task is to find the leaders in the array.
An element of array is leader if it is greater than or equal to all the elements to its right side.
The rightmost element is always a leader.
*/
public class LeadersInArray {

    public static void main(String[] args) {
        int[] arr = {19, 56, 23, 3, 55, 2};
        List<Integer> leaders = leaders1(arr);
        System.out.println(leaders);
    }

    // solution with time complexity O(n2)
    static List<Integer> leaders(int arr[]) {
        List<Integer> leaders = new ArrayList();

        for (int i = 0; i < arr.length - 1; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                leaders.add(arr[i]);
            }
        }
        leaders.add(arr[arr.length - 1]);
        return leaders;
    }

    // solution with time complexity O(n)
    static List<Integer> leaders1(int arr[]) {
        List<Integer> leaders = new ArrayList();

        int leaderFromRight = arr[arr.length - 1];
        leaders.add(leaderFromRight);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= leaderFromRight) {
                leaderFromRight = arr[i];
                leaders.add(leaderFromRight);
            }
        }
        return leaders;
    }
}
