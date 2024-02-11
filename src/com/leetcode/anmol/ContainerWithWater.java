package com.leetcode.anmol;

class ContainerWithWater{
	
	public static void main(String [] args){
		int []height={1,8,6,2,5,4,8,3,3,8,87};
		int area=getMaxArea(height);
		System.out.println(area);
	}
	public static int getMaxArea(int[] height){

	int maxArea=0;
	int left=0;
	int right=height.length-1;
	
	while(left<right){
		
		int width=right-left;
		maxArea=Math.max(maxArea,Math.min(height[left],height[right])*width);
		if(height[left]<=height[right]){
			left++;
		}else{
			right--;
		}
	}
		
	return maxArea;
	}
}	