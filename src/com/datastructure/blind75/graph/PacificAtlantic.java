package com.datastructure.blind75.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlantic {

	public static void main(String[] args) {

		// theory -https://www.youtube.com/watch?v=64496xYlLJQ -code with alisha
		// Code- https://walkccc.me/LeetCode/problems/0417/ - check BFS solution also
		//code-recommended--https://walkccc.me/LeetCode/problems/0417/
		// DFS
		// Time-0(mn),space-0(mn)

		// int
		// [][]matrix={{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
		int[][] matrix = { { 1 } };
		System.out.println("matrix--" + pacificAtlantic(matrix));

	}

	public static List<List<Integer>> pacificAtlantic(int[][] heights) {

		List<List<Integer>> res = new ArrayList<>();
		int rows = heights.length;
		int columns = heights[0].length;
		boolean[][] pacific = new boolean[rows][columns];
		boolean[][] atlantic = new boolean[rows][columns];

		for (int i = 0; i < columns; i++) {
			func(heights, 0, i, Integer.MIN_VALUE, pacific);
			func(heights, rows - 1, i, Integer.MIN_VALUE, atlantic);

		}

		for (int j = 0; j < rows; j++) {

			func(heights, j, 0, Integer.MIN_VALUE, pacific);
			func(heights, j, columns - 1, Integer.MIN_VALUE, atlantic);
		}

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {

				if (pacific[i][j] && atlantic[i][j]) {
					res.add(Arrays.asList(i, j));
				}
			}
		}
		return res;
	}

	public static void func(int[][] heights, int i, int j, int prev, boolean[][] ocean) {

		if (i < 0 || j < 0 || i >= heights.length || j >= heights[0].length)
			return;
		if (ocean[i][j] == true)
			return;
		if (heights[i][j] < prev)
			return;

		ocean[i][j] = true;

		func(heights, i + 1, j, heights[i][j], ocean);
		func(heights, i - 1, j, heights[i][j], ocean);
		func(heights, i, j + 1, heights[i][j], ocean);
		func(heights, i, j - 1, heights[i][j], ocean);

	}
}
