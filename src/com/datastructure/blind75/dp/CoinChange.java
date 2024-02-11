package com.datastructure.blind75.dp;

public class CoinChange { //Unbounded Knapsack
 ///code--https://leetcode.com/problems/coin-change/solution/
	
	//theory --https://www.youtube.com/watch?v=-NTaXJ7BBXs
	//theory --https://www.youtube.com/watch?v=ZI17bgz07EE
	//https://www.youtube.com/watch?v=H9bfqozjoqs
	public static void main(String[] args) {
		int arr[]={5,2,1};
		System.out.println(coinChange(arr,11));

	}
	 public static int coinChange(int[] coins, int amount) {
         int[] mins = new int[amount + 1];
        for (int i = 1; i <= amount; i ++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j ++) {
                if (i - coins[j] >= 0 && mins[i - coins[j]] != Integer.MAX_VALUE) {
                    min = Math.min(min, mins[i - coins[j]] + 1);
                }   
            }
            mins[i] = min;
        }
        if (mins[amount] == Integer.MAX_VALUE) {
            return -1;
        }
        return mins[amount];
    }
    
}
