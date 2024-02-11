package com.datastructure.blind75.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

	private static Set<String> dictionary = new HashSet<>();

	public static void main(String[] args) {

		// set to hold dictionary values
		// array of strings to be added in dictionary set.
		String temp_dictionary[] = { "mobile", "samsung", "sam", "sung", "man", "mango", "icecream", "and", "go", "i",
				"like", "ice", "cream" };

		// loop to add all strings in dictionary set
		for (String temp : temp_dictionary) {
			dictionary.add(temp);
		}

		// sample input cases
		System.out.println(wordBreak("ilikesamsung"));// recursion
														// -https://www.geeksforgeeks.org/word-break-problem-dp-32/
		
		List<String>wordDict=new ArrayList<>();
		wordDict=Arrays.asList(temp_dictionary);
		
		
		System.out.println(dpSolution("ilikesamsung",wordDict));// DP problem -accepted

	}

	// Bottom-up
	//https://github.com/Cee/Leetcode/blob/master/139%20-%20Word%20Break.java -code
	//check this also =https://walkccc.me/LeetCode/problems/0139/
	
	/*Time:O(n3) 
	Space: (O(n2+Σ∣wordDict[i]∣)
	*/
	private static boolean dpSolution(String s, List<String> wordDict) {
		boolean[] dp = new boolean[s.length() + 1];
		Set<String> wordDictSet = new HashSet<>(wordDict);
		dp[0] = true;
		for (int i = 1; i <= s.length(); i++) {

			for (int j = 0; j < i; j++) {
				
				if (dp[j] && wordDictSet.contains(s.subSequence(j, i))) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[s.length()];

	}

	// Time Complexity: The time complexity of the above code will be O(2^n).
	// Auxiliary Space: The space complexity will be O(n) as we are using
	// recursion and the recursive call stack will take O(n) space.
	private static boolean wordBreak(String word) {

		int size = word.length();
		if (size == 0) {
			return true;
		}
		for (int i = 1; i <= size; i++) {

			if (dictionary.contains(word.substring(0, i)) && wordBreak(word.substring(i, size)))

				return true;
		}

		return false;
	}

}
