package com.datastructure.blind75.dp;

public class ClimbingStairs {

	public static void main(String[] args) { //theroy and code--https://www.youtube.com/watch?v=Y0lT9Fck7qI

		
		System.out.println(countSteps(4));
	}

	public static int countSteps(int n){
		
		int one=1;
		int two=1;
		
		for(int i=0;i<n-1;i++){
			
			int temp=one;
			one=one+two;
			two=temp;
			
		}
		return one;
		
	}
}
