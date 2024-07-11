package com.datastructure.blind75.string;

import java.util.HashMap;

public class MinWindowSubString {

	public static void main(String[] args) {
		String s = "ADOBECODEBANC";

		String t = "ABC";
		
		System.out.println(minWindow(s,t));
	}

	public static String minWindow(String s,String t) {

		HashMap<Character, Integer> countT = new HashMap<>();
		for (char c : t.toCharArray()) {
			countT.put(c, countT.getOrDefault(c, 0) + 1);
		}

		return "";

	}
}
