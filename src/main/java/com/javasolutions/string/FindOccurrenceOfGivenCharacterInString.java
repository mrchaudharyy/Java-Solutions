package com.javasolutions.string;

public class FindOccurrenceOfGivenCharacterInString {
    public static void main(String[] args) {
        String value = "aaabbbcccddd";
        char givenChar = 'a';
        int occurrence = 0;
        char[] charArray = value.toCharArray();

        for (char c : charArray) {
            if (c == givenChar) {
                occurrence++;
            }

        }

        System.out.println("Char '" + givenChar + "' occurs " + occurrence + " times ");
    }
}
