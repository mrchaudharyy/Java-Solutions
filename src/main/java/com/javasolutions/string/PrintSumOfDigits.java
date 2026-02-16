package com.javasolutions.string;

public class PrintSumOfDigits {

    public static void main(String[] args) {
        String mainString = "123456789";
        int sum = 0;
        char[] arr = mainString.toCharArray();

        for (char c : arr) {
            int val = Integer.parseInt(String.valueOf(c));
            sum += val;
        }

        System.out.println("Sum is " + sum);
    }
}
