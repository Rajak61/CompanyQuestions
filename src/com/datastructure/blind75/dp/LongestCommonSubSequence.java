package com.datastructure.blind75.dp;

public class LongestCommonSubSequence {

	// theory-https://www.youtube.com/watch?v=sSno9rV8Rhg
	// https://www.youtube.com/watch?v=y1b8pObvndA
	public static void main(String[] args) {

		String S1 = "AGGTAB";
		String S2 = "GXTXAYB";

		System.out.println("Length of LCS is" + " " + longestCommonSubsequence(S1, S2));
		System.out.println("Length of LCS is" + " " + longestCommonSubsequenc(S1, S2));//accepted
		System.out.println("Length of LCS is" + " " + longestCommonSubsequen(S1, S2));
		//System.out.println("Length of LCS is" + " " + LCS(S1, S2));//reverse loop
	}
	// Time: O(mn) Space: O(mn)

	// bottom-up tabulation
	public static int longestCommonSubsequence(String text1, String text2) {// https://walkccc.me/LeetCode/problems/1143/
		final int m = text1.length();
		final int n = text2.length();
		// dp[i][j] := LCS's length of text1[0..i) and text2[0..j)
		int[][] dp = new int[m + 1][n + 1];

		for (int i = 0; i < m; ++i)
			for (int j = 0; j < n; ++j)
				dp[i + 1][j + 1] = text1.charAt(i) == text2.charAt(j) ? 1 + dp[i][j]
						: Math.max(dp[i][j + 1], dp[i + 1][j]);

		return dp[m][n];
	}

	//acccepted  --https://www.youtube.com/watch?v=y1b8pObvndA same but opposite loop
	static int longestCommonSubsequenc(String text1, String text2) {// https://leetcode.com/problems/longest-common-subsequence/solutions/2666815/detailed-dp-o-mn-solution-in-java/?orderBy=most_votes

		int m = text1.length();
		int n = text2.length();

		int[][] dp = new int[m + 1][n + 1];

		for (int i = 0; i <= m; i++) {

			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

				}
			}
		}
		return dp[m][n];
	}

	public static int longestCommonSubsequen(String text1, String text2) {
		int m = text1.length();
		int n = text2.length();

		int L[][] = new int[m + 1][n + 1];

		// Following steps build L[m+1][n+1] in bottom up
		// fashion. Note that L[i][j] contains length of LCS
		// of X[0..i-1] and Y[0..j-1]
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					L[i][j] = 0;
				else if (text1.charAt(i - 1) == text2.charAt(j - 1))
					L[i][j] = L[i - 1][j - 1] + 1;
				else
					L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
			}
		}
		return L[m][n];

	}
	
//	
//	public static int LCS(String s1, String s2) {
//	    
//	    int[] next = new int[s1.length()+1], curr = new int[s2.length()+1];
//	    
//	    for( int i = s1.length()-1; i >= 0 ; i-- ){
//	        for( int j = s2.length()-1; j >=0; j-- ){
//	            if( s1.charAt(i) == s2.charAt(j) ){
//	                curr[j] = 1+next[j+1];
//	            }else{
//	                curr[j] = Math.max(curr[j+1], next[j]);
//	            }                
//	        }
//	        next = curr.clone();
//	    }
//	    
//	    return next[0];
//	}
}
