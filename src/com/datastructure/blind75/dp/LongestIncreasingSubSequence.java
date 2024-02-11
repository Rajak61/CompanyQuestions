package com.datastructure.blind75.dp;

import java.util.Arrays;

public class LongestIncreasingSubSequence {

	// video=https://www.youtube.com/watch?v=cjWnW0hdF1Y
	// https://www.youtube.com/watch?v=SHFyIAnjj90

	// code-https://www.interviewbit.com/blog/longest-increasing-subsequence/
	
	public static void main(String args[]) {
		// int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
		int arr[] = { 3, 10, 2, 11 };
		System.out.println(lis(arr));// binary O(nlogn)
		System.out.println(lisub(arr));// DP O(n2)
		System.out.println(lengthOfLIS(arr));
		System.out.println(allowed(arr));
	}

	//Greedy With Binary Search: Efficient Approach
	static int lis(int nums[]) { /// binary-/// https://www.interviewbit.com/blog/longest-increasing-subsequence/
								//		https://walkccc.me/LeetCode/problems/0300/			
		int[] tails = new int[nums.length];
		int size = 0;
		for (int x : nums) {
			int i = 0, j = size;
			while (i != j) {
				int m = (i + j) / 2;
				if (tails[m] < x)
					i = m + 1;
				else
					j = m;
			}
			tails[i] = x;
			if (i == size)
				++size;
		}
		return size;

	}

	// Input: arr[] = {3, 10, 2, 11}
	// LIS[] = {1, 1, 1, 1} (initially)
	//
	// Iteration-wise simulation:
	//
	// arr[2] > arr[1] {LIS[2] = max(LIS [2], LIS[1]+1 = 2}
	// arr[3] < arr[1] {No change}
	// arr[3] < arr[2] {No change}
	// arr[4] > arr[1] {LIS[4] = max(LIS [4], LIS[1]+1 = 2}
	// arr[4] > arr[2] {LIS[4] = max(LIS [4], LIS[2]+1 = 3}
	// arr[4] > arr[3] {LIS[4] = max(LIS [4], LIS[3]+1 = 3}
	
	static int lisub(int arr[])// DP-Memoization & Tabulation
								// //https://www.interviewbit.com/blog/longest-increasing-subsequence/
	{//https://www.geeksforgeeks.org/longest-increasing-subsequence-dp-3/
		int n = arr.length;
		int lis[] = new int[n];
		int i, j, max = 0;

		/* Initialize LIS values for all indexes */
		for (i = 0; i < n; i++)
			lis[i] = 1;

		/*
		 * Compute optimized LIS values in bottom up manner
		 */
		for (i = 1; i < n; i++)
			for (j = 0; j < i; j++)
				if (arr[j] < arr[i] && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;

		/* Pick maximum of all LIS values */
		for (i = 0; i < n; i++)
			if (max < lis[i])
				max = lis[i];

		return max;
	}

	
	//practice
	
	static int allowed(int[] n) {
		int[] lis = new int[n.length];
		int i, j, max = 0;
		for (i = 0; i < n.length; i++) {
			lis[i] = 1;

		}
		for (i = 1; i < n.length; i++) {
			for (j = 0; j < i; j++) {
				if (n[j] < n[i] && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;
			}
		}

		for (i = 0; i < n.length; i++) {
			if (max < lis[i])
				max = lis[i];
		}
		return max;
	}

	public static int lengthOfLIS(int[] nums) {// https://walkccc.me/LeetCode/problems/0300/
		if (nums.length == 0)
			return 0;

		// dp[i] := Length of LIS ending at nums[i]
		int[] dp = new int[nums.length];
		Arrays.fill(dp, 1);

		for (int i = 1; i < nums.length; ++i)
			for (int j = 0; j < i; ++j)
				if (nums[j] < nums[i])
					dp[i] = Math.max(dp[i], dp[j] + 1);

		return Arrays.stream(dp).max().getAsInt();
	}
}
