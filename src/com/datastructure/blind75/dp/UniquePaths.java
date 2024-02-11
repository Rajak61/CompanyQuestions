package com.datastructure.blind75.dp;

import java.util.Arrays;

public class UniquePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=3,n=7;
		//theory--https://www.youtube.com/watch?v=-fS1pS1mxQc -bottom up
		System.out.println(uniquePathsTopDown(m,n));//top Down -code-https://www.youtube.com/watch?v=rBAxUTqvlQA
		System.out.println(uniquePathsBottomUp(m,n));//Bottom up Down =https://www.youtube.com/watch?v=-fS1pS1mxQc
		System.out.println(uniquePathsOptimized(m,n));//optimized -1D array -recommended
		
		
	}
	//space -O(n) time -O(mn)
	///code- https://walkccc.me/LeetCode/problems/0062/
	private static int uniquePathsOptimized(int m, int n) {
		
		
		int dp[]=new int[n];
		Arrays.fill(dp, 1);
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++){
				dp[j]+=dp[j-1];
			}
		}
		return dp[n-1];
	}
	
	
	//space -O(mn) time -O(mn)
	//bottom up -code-https://github.com/neetcode-gh/leetcode/blob/main/java/0062-unique-paths.java
	private static int uniquePathsBottomUp(int m, int n) {
		
		int dp[][]=new int [m][n];
		//fill last row
		for(int j=0;j<n;j++){
			
			dp[m-1][j]=1;
		}
		//fill last column
		for(int i=0;i<m;i++){
			
			dp[i][n-1]=1;
		}
		for(int i=m-2;i>=0;i--){
			for(int j=n-2;j>=0;j--){
				
				dp[i][j]=dp[i][j+1]+dp[i+1][j];
			}
			
		}
		
		return dp[0][0];
	}
	//space -O(mn) time -O(mn)
	//code -top down -https://www.youtube.com/watch?v=rBAxUTqvlQA
	public static int uniquePathsTopDown(int m,int n){
		
		int dp[][]=new int[m][n];
		for(int i=0;i<m;i++){
			
			for(int j=0;j<n;j++){
				
				if(i==0||j==0){
					dp[i][j]=1;
				}else{
					dp[i][j]=dp[i-1][j]+dp[i][j-1];
				}
			}
		}
		return dp[m-1][n-1];
		
	}
	
	//bottom up
	

}
