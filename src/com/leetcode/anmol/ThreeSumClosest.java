package com.leetcode.anmol;
import java.util.Arrays;
class ThreeSumClosest{
//https://www.youtube.com/watch?v=BS7_bRsJFiI
	//https://leetcode.com/list/kj7jcr2
	///https://www.youtube.com/watch?v=OWCao3Ul6n4
public static void main(String args[]){
	
	int[] num={-1,2,1,-4};
	int target=1;
	int number=threeCloseSum(num,target);
	System.out.println(number);
}

public static int threeCloseSum(int[] nums,int target){
	Arrays.sort(nums);
	int closestSum=nums[0]+nums[1]+nums[nums.length-1];
	
	for(int i=0;i<nums.length-2;i++){
	 int left=i+1;
	 int right=nums.length-1;
	 
	 while(left<right){
		 int curSum=nums[i]+nums[left]+nums[right];
		 if(curSum<target){
			 
			 left++;
		 }else{
			 
			 right--;
		 }
		  if(Math.abs(curSum-target)<Math.abs(closestSum-target)){
		 
		 closestSum=curSum;
	 }
	 }
	
	}	

return closestSum;	
	
}
	

}