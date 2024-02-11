package com.datastructure.blind75.dp;

import java.util.HashMap;

public class DecodeWays {

	
	///theory -https://www.youtube.com/watch?v=dikmR3LaOFk&t=49s
	//theory -
	
	//code- https://leetcode.com/problems/decode-ways/solutions/30358/java-clean-dp-solution-with-explanation/
	//https://www.youtube.com/watch?v=Nc2UZIjoB18
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numDecodings("226"));
		System.out.println(numCodingPractice("226"));
	}

	 public static int numDecodings(String s) {
		 
		 int n=s.length();
		 int dp[]=new int[n+1];
		 dp[0]=1;
		 dp[1]=s.charAt(0)!=0?1:0;
		 for(int i=2;i<=n;i++){
			 
			 int first=Integer.valueOf(s.substring(i-1,i));
			 int second=Integer.valueOf(s.substring(i-2,i));
			 if(first>=1 && first<=9){
				 dp[i]+=dp[i-1];
			 }
			 if(second>=10 && second <=26){
				 dp[i]+=dp[i-2];
			 }
		 }
		 
		 return dp[n];
	 }
	 
	 //practice
	 public static int numCodingPractice(String s){
		 
		 int n=s.length();
		 int dp[]=new int[n+1];
		 dp[0]=1;
		 dp[1]=s.charAt(0)!=0?1:0;
		 for(int i=2;i<=n;i++){
			 
			 int first=Integer.valueOf(s.substring(i-1,i));
			 int second=Integer.valueOf(s.substring(i-2,i));
			 
			 if(first>=1 && first<=9){
				 dp[i]+=dp[i-1];
			 }
			 if(second>=10 && second<=26){
				 dp[i]+=dp[i-2];
			 }
		 }
		 return dp[n];
	 }
}
