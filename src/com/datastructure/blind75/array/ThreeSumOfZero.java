package com.datastructure.blind75.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumOfZero {

	public static void main(String[] args) { // check theory and code --https://www.youtube.com/watch?v=Ca7k53qcTic
		int[] a = { -1, 0, 1, 2, -1, -4 };
		//Arrays.sort(a);
		// System.out.println(threeSum(a));
		System.out.println(get3Sum(a));
		
	}

	public static List<List<Integer>> threeSum(int[] nums) { 
		int n = nums.length;
		Arrays.sort(nums);// -4,-1,-1,0,1,2
		List<List<Integer>> ls = new ArrayList<>();
		for (int i = 0; i < n - 2; i++) {
			if (i == 0 || nums[i] != nums[i - 1]) {

				int j = i + 1;
				int k = n - 1;
				while (j < k) {

					int sum = nums[i] + nums[j] + nums[k];
					if (sum == 0) {

						ls.add(Arrays.asList(nums[i], nums[j], nums[k]));
						while (j < k && nums[j] == nums[j + 1]) {
							j++;
						}
						while (j < k && nums[k] == nums[k - 1]) {
							k--;
						}
						j++; // if we remove this and below line
						k--;
					} else if (sum < 0) {
						j++;
					} else {
						k--;
					}
				}
			}
		}
		return ls;
	}

	// practice
	public static List<List<Integer>> get3Sum(int nums[]) {
		List<List<Integer>> ls = new ArrayList<>();
		Arrays.sort(nums);
		int n = nums.length;
		for (int i = 0; i < n - 2; i++) { // n-2 for j and k second last,last element
			if (i == 0 || nums[i] != nums[i - 1]) { // repeat element check for i but allow 0
				int j = i + 1;
				int k = n - 1;
				while (j < k) {
					int sum = nums[i] + nums[j] + nums[k];
					if (sum == 0) {
						ls.add(Arrays.asList(nums[i], nums[j], nums[k]));
						while (j < k && nums[j] == nums[j + 1]) { // repeat no case checks
							j++;
						}
						while (j < k && nums[k] == nums[k - 1]) {
							k--;
						}
						j++; // if found sum then go for next iteration
						k--;
					} else if (sum < 0) {
						j++;
					} else {
						k--;
					}
				}
			}
		}

		return ls;

	}
}
