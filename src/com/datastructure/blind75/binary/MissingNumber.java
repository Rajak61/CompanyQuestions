package com.datastructure.blind75.binary;

public class MissingNumber {

	public static void main(String[] args) { // https://www.youtube.com/watch?v=YRsy-pYAZ30
		
		int nums[]={2,3,5,6,4,0};
		System.out.println(getNumber(nums));
		}

	private static int getNumber(int[] nums) {  //check for 2 missing also
		
		int n=nums.length;
		int expected=n*(n+1)/2;
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			sum=sum+nums[i];
		}
		return expected-sum;
	}

}
