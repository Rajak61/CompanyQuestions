package com.datastructure.blind75.dp;

public class HouseRobber2 {

	// theory https://www.youtube.com/watch?v=rWAJCfYYOvM&lc=UgwOOxnll0qkAnDLx854AaABAg
	
	// code =https://walkccc.me/LeetCode/problems/0213/--optimized solution

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 1 };
		System.out.println(" solution -" + robHouse(arr));
		//System.out.println("practice solution -" + robHouseoptimized(arr));

	}
	//Time=0(n)||space=(1)
	private static int robHouse(int[] nums) {
		
		if(nums.length==0)
			return 0;
		if(nums.length==1){
			return nums[0];
		}
		return Math.max(rob(nums,0,nums.length-2),rob(nums,1,nums.length-1));
	}
	
	private static int rob(int [] nums,int l,int r){ 
		int prev1=0;
		int prev2=0;
		for(int i=l;i<=r;i++){
			int dp=Math.max(prev1, prev2+nums[i]);
			prev2=prev1;
			prev1=dp;
		}
		
		return prev1;
		
	}
	  
	

}
