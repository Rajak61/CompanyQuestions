package com.datastructure.blind75.array;

public class BuyAndSellStockProfit {

	public static void main(String[] args) {
		int a[] = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(a));// 1st approach
												// --https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solution/
												//---recommended
		System.out.println(maxProfitSell(a));// 2nd
												// approach--https://www.youtube.com/watch?v=34WE6kwq49U
												//
	}

	public static int maxProfit(int[] a) {  //check this only //sliding window
		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] < minprice) {
				minprice = a[i];
			} else if (a[i] - minprice > maxprofit) {
				maxprofit = a[i] - minprice;

			}
		}
		return maxprofit;
	}

	public static int maxProfitSell(int a[]) {
		int minprice = a[0];
		int maxprofit = 0;
		for (int i = 0; i < a.length; i++) {
			minprice = Math.min(a[i], minprice);
			int profit = a[i] - minprice;
			maxprofit = Math.max(maxprofit, profit);
		}
		return maxprofit;

	}

}
