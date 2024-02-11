package com.leetcode.anmol;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] nums={-1,2,1,-4};
		int target = 1;
		int closetSum = threeIntSum(nums, target);
		System.out.println(closetSum);

	}

	public static int threeIntSum(int[] nums, int target) {
		Arrays.sort(nums);

		int closestSum = nums[0] + nums[1] + nums[nums.length - 1];

		for (int i = 0; i < nums.length - 2; i++) {

			int start = i + 1;
			int end = nums.length - 1;

			while (start < end) {
				int curSum=nums[i]+nums[start]+nums[end];
				
				if(curSum<target){
					
					start++;
				}else{
					end--;
				}
				if(Math.abs(curSum-target)<Math.abs(closestSum-target)){
					closestSum=curSum;
					
				}
			}
		}
		return closestSum;
	}
}
