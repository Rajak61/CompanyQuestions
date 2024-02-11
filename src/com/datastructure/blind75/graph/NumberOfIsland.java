package com.datastructure.blind75.graph;

public class NumberOfIsland {

	//time-0(mn),Space-(min(m,nl))
	//COde DFS and BFS -https://walkccc.me/LeetCode/problems/0200/
	//Theory and code DFS -https://www.youtube.com/watch?v=3CoLbGz-3fc  -recommended
	//Theory BFS and DFS-https://www.youtube.com/watch?v=uspsIxavTzA
	public static void main(String[] args) {
		char [][] grid = {
				{'1','1','1','1','0'},
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'0','0','0','0','0'}
		};
		System.out.println(numIsland(grid));
	}
	
	public static int numIsland(char[][]grid){
		
		int count=0;
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[0].length;j++){
				
				if(grid[i][j]=='1'){
					
					dfs(grid,i,j);
					count++;
				}
			}
			
		}
		return count;
	}
	
	private static void dfs(char[][]grid,int i,int j){
		
		if(i>=0 && j>=0 && i<grid.length&& j<grid[0].length&& grid[i][j]=='1'){
			
			grid[i][j]='0';
			dfs(grid,i+1,j);
			dfs(grid,i-1,j);
			dfs(grid,i,j+1);
			dfs(grid,i,j-1);
		}
		
	}

}
