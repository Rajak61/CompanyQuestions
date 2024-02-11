package com.datastructure.blind75.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int a[] = { 2, 7, 11, 15 };
		int n = 9;
		// int a[]={3,2,4};
		// int n=6;
	//	int[] no = twoSum(a, n);//2nd approach
		
		//int[] no =targetSum(a, n);// not req
//		for (int i = 0; i < no.length; i++) {
//			System.out.println(no[i]);
//		}
		
		//one pass approach best approach
		
		int[] newArray=twoSumUsingMap(a, n);
		//int[] newArray=getSum(a, n);
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}

	}

	public static int[] twoSumUsingMap(int[] nums, int target) {//recommended
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] {
						map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		// In case there is no solution, we'll just return null
		return null;
	}

	public static int[] twoSum(int[] nums, int target) {// 1st approach
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					return new int[] { i, j };
				}
			}
		}
		return null;

	}
	//
	// static int[] targetSum(int []a , int target)
	// {
	// int left = 0 , right = a.length - 1 , tempSum;
	// while(left < right)
	// {
	// tempSum = a[left] + a[right];
	// if(tempSum == target)
	// return new int[]{left + 1 , right + 1};
	// if(tempSum > target)
	// right--;
	// else
	// left++;
	// }
	// return new int[]{-1 , -1};
	// }

	public static int[] getSum(int nums[],int target){//not correct
		
		  int i =0;int j=nums.length-1;
		    
	        while(i<j){
	            
	            if(nums[i]+nums[j]>target)
	                j--;
	            else if(nums[i]+nums[j]<target)
	                i++;
	            else
	               return new int[]{i,j};
	        }
	        return null;
	}
}