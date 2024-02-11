package com.datastructure.blind75.array;

public class MinimumInRotatedSortedArray {

	// theory --https://www.youtube.com/watch?v=nIVW4P8b1VA
	/// code --with and without recursion
	// --https://cheonhyangzhang.gitbooks.io/leetcode-solutions/content/153_find_minimum_in_rotated_sorted_array__medium.html
	public static void main(String[] args) { // code i chose
												// -https://www.youtube.com/watch?v=OXkLNPalfRs
		// TODO Auto-generated method stub
		int[] nums = { 3, 4, 5, 1, 2 };
		System.out.println(findMin(nums));
	}

	public static int findMin(int[] nums) {

		int l = 0;
		int r = nums.length - 1;

		while (l < r) {

			int mid = l + (r - l) / 2;
			
			if (nums[mid] > nums[r])
				l = mid + 1;
			else if (nums[mid] < nums[r])
				r = mid;
			else
				return nums[r];

		}
		return nums[r];
	}
}
