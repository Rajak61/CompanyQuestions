package com.datastructure.blind75.array;

public class MaximumSubarray {

	public static void main(String[] args) { //https://www.youtube.com/watch?v=HCL4_bOd3-4 -Kadane's Algorithm 
		// TODO Auto-generated method stub //https://www.youtube.com/watch?v=jnoVtCKECmQ - same but using Math
		//brute force-- https://www.enjoyalgorithms.com/blog/maximum-subarray-sum
		//int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums={0};
		System.out.println(getMaxSubArray(nums));
		System.out.println(getMaxArray(nums));///recommended /dynamic programming
		
	}
	
	public static int getMaxSubArray(int [] nums){ ////https://www.youtube.com/watch?v=HCL4_bOd3-4 -Kadane's Algorithm
		
		 int currSum=0;
		 int maxSum=nums[0];
		
		 for(int i=0;i<nums.length;i++){
			 
			 currSum=currSum+nums[i];
			 if(currSum>maxSum){
				 maxSum=currSum;
				 
			 }
			 if(currSum<0){
				 currSum=0;
			 }
		 }
		return maxSum;
		
		
	}
	
	public static int maxSubArr(int[] nums){ //Recommenced [-2,2,5,-11,6]//
		//https://www.youtube.com/watch?v=jnoVtCKECmQ - same but using Math
		
		int currSum=0;
		int maxSum=nums[0];
		for (int i = 0; i < nums.length; i++) {
			currSum=Math.max(currSum+nums[i], nums[i]);
			maxSum=Math.max(currSum, maxSum);
			
		}
		
		return maxSum;
	}
	
	public static int getMaxArray(int [] nums)///same as above
	{
		int currSum=0;
		int maxSum=nums[0];
		for (int i = 0; i < nums.length; i++) {
			currSum=Math.max(currSum+nums[i],nums[i]);
			maxSum=Math.max(currSum, maxSum);
		}
		return maxSum;
	}
}
