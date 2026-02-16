package com.javasolutions.competitive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
public class GroupAnagrams {

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(strs));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> group = new HashMap<String, List<String>>();

		for (int i = 0; i < strs.length; i++) {
			char[] current = strs[i].toCharArray();
			Arrays.sort(current);
			String currentSorted = String.valueOf(current);
			
			if (!group.containsKey(currentSorted)) {
				group.put(currentSorted, new ArrayList<>());
			}
			group.get(currentSorted).add(strs[i]);
		}

		return new ArrayList<>(group.values());

	}

}
