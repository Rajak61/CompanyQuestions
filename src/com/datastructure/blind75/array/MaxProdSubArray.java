package com.datastructure.blind75.array;

public class MaxProdSubArray {

	public static void main(String[] args) { //dynamic programming
		// TODO Auto-generated method stub //https://cheonhyangzhang.gitbooks.io/leetcode-solutions/content/152_maximum_product_subarray__medium.html
		//check theory --https://www.youtube.com/watch?v=lXVy6YWFcRM
		
		int[] nums={2,3,-2,4};
		System.out.print(getMaxProd(nums));
	}
	public static int getMaxProdSubArray(int[]nums){
		
		int maxProd=nums[0];
		int minTemp=nums[0];
		int maxTemp=nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			
			int a=maxTemp*nums[i];
			int b=minTemp*nums[i];
			
			maxTemp=Math.max(Math.max(a, b),nums[i]);
			minTemp=Math.min(Math.min(a, b),nums[i]);
			maxProd=Math.max(maxTemp, maxProd);
		}
		return maxProd;
		
	}
	
	//practice
	
	public static int getMaxProd(int[] nums){
		int maxProd=nums[0];
		int minTemp=nums[0];
		int maxTemp=nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			
			int a=nums[i]*maxTemp;
			int b=nums[i]*minTemp;
			
			maxTemp=Math.max(Math.max(a,b),nums[i]);
			minTemp=Math.min(Math.min(a,b),nums[i]);
			maxProd=Math.max(maxTemp,maxProd);
		}
		return maxProd;
		
	}

}
