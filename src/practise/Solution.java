package practise;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) throws InterruptedException {
		long startTime = System.currentTimeMillis();
		// StringBuilder hello = new StringBuilder(" ");
		String hello = " ";
		for (int i = 0; i < 500000; i++) {
			// hello = "a " + i + "a " + i + "b " + i + "c " + i + "d " + i + "e " + i + "f
			// " + i + "g " + i;
			hello = "a ";
			hello = hello + i;
			hello = hello + "b ";
			hello = hello + i;
			hello = hello + "c ";
			hello = hello + i;
			hello = hello + "d ";
			hello = hello + i;
			hello = hello + "e ";
			hello = hello + i;
			hello = hello + "f ";
			hello = hello + i;
			hello = hello + "g ";
			hello = hello + i;

		}

//		for (int i = 0; i < 500000; i++) {
//			hello.append(i).append("a ").append(i).append("b ").append(i).append("c ").append(i).append("d ")
//			.append(i).append("e ").append(i).append("f ").append(i).append("g ").append(i);
//		}
		long end = System.currentTimeMillis();
		System.out.println("Time took " + (end - startTime) + "ms");
	}

}
