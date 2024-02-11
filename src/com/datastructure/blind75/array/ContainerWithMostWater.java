package com.datastructure.blind75.array;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(getMaxArea(height));//https://www.youtube.com/results?search_query=Container+With+Most+Water
	}

	public static int getMaxArea(int[] height) {
		int max = 0;
		int left = 0;
		int right = height.length - 1;

		while (left < right) {
			int width = right - left;
			max = Math.max(max, Math.min(height[left], height[right]) * width);
			if (height[left] <= height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return max;
	}

}
