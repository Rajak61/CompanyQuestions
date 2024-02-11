package com.datastructure.blind75.dp;

public class HouseRobber {

	//not go for this --// theory lovebbabar =https://www.youtube.com/watch?v=Fe2GeXEzWM0 --
	// techdose--https://www.youtube.com/watch?v=jzpsHKJy00c
	// nikwhite -https://www.youtube.com/watch?v=jzpsHKJy00c
	// code =https://walkccc.me/LeetCode/problems/0198/ --optimized solution

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 1 };
		System.out.println("general solution -" + robHouse(arr));
		System.out.println("optimized solution -" + robHouseoptimized(arr));

	}

	// o(n)//space-o(n)
	private static int robHouse(int[] arr) {// https://www.youtube.com/watch?v=ZwDDLAeeBM0
											// -nick
		if (arr.length == 0)
			return 0;
		int dp[] = new int[arr.length + 1];
		dp[0] = 0;
		dp[1] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			dp[i + 1] = Math.max(dp[i], dp[i - 1] + arr[i]);
		}
		return dp[arr.length];
	}

	// time -o(n),space(1);
	private static int robHouseoptimized(int[] arr) {//https://walkccc.me/LeetCode/problems/0198/
		int prev1=0;//dp[i-1]
		int prev2=0;//dp[i-2]
		for (int i = 0; i < arr.length; i++) {
			int dp=Math.max(prev1, prev2+arr[i]);
			prev2=prev1;
			prev1=dp;
		}
		
		return prev1;
	}

}
