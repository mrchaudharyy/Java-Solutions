package com.javasolutions.string;

// Java is Great should be printed Great is Java
public class ReverseWordsInString {

	public static void main(String[] args) {
		String sentence = "Java is Great";
		String reversed = "";
		String[] split = sentence.split(" ");

		for (int i = split.length-1; i >= 0; i--) {
			reversed += split[i] + " ";
		}
		System.out.println(reversed);

	}

}
