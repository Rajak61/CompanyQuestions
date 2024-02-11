package com.datastructure.blind75.dp;

public class CombinationSumIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3 };
		int target = 4;

		System.out.println(combinationSum(arr, target));//// time limit issue
		// -recursion

		int dp[] = new int[target + 1];
		System.out.println("memo-" + combinationSum4(arr, target, dp));//// time
																		//// limit
																		//// issue
																		//// -recursion+memo
		Integer[] memo = new Integer[target + 1];
		// return recurse(nums, target, memo);
		System.out.println("memo-" + recurse(arr, target, memo));//// time limit
																	//// issue
																	//// -recursion+memo

//************		// accepted solution - *********************************************
		// https://leetcode.com/problems/combination-sum-iv/solutions/2380780/java-simple-solution-100-faster-code/
		System.out.println("tabulation-" + tabulation(arr, target));
	}

	// theory -youtube.com/watch?v=Wct0mN2SCRQ
	// code- https://walkccc.me/LeetCode/problems/0377/
	// time o(coins*target) , //Space:o(target)

	// https://walkccc.me/LeetCode/problems/0377/
	// https://leetcode.com/problems/combination-sum-iv/solutions/2380780/java-simple-solution-100-faster-code/
	private static int tabulation(int[] arr, int target) {

		int[] dp = new int[target + 1];
		dp[0] = 1;
		for (int i = 1; i <= target; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (i - arr[j] >= 0) {
					dp[i] += dp[i - arr[j]];
				}
			}
		}
		return dp[target];
	}

	public static int recurse(int[] nums, int remain, Integer[] memo) {

		if (remain < 0)
			return 0;
		if (memo[remain] != null)
			return memo[remain];
		if (remain == 0)
			return 1;

		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			ans += recurse(nums, remain - nums[i], memo);
		}

		memo[remain] = ans;
		return memo[remain];
	}

	private static int combinationSum4(int[] arr, int tar, int[] dp) {

		if (tar < 0)
			return 0;

		if (dp[tar] != -1) {
			return dp[tar];
		}
		if (tar == 0)
			return 1;

		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans += combinationSum4(arr, tar - arr[i], dp);
		}
		dp[tar] = ans;
		return dp[tar];
	}

	// time limit issue -recursion
	private static int combinationSum(int[] arr, int tar) {
		if (tar < 0)
			return 0;
		if (tar == 0)
			return 1;
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans += combinationSum(arr, tar - arr[i]);
		}
		return ans;
	}
}
