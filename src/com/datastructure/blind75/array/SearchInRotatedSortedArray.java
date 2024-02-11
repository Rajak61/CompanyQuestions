package com.datastructure.blind75.array;

public class SearchInRotatedSortedArray { // theory
	// https://www.youtube.com/watch?v=U8XENwh8Oy8 -neetcode
	// https://www.youtube.com/watch?v=Le8bc8aHgBA -anuj --recommended

	public static void main(String[] args) {
		int nums[] = { 5, 1, 3 };
		System.out.println(searchNew(nums, 3));
	}

	public static int search(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;

		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] == target) {
				return mid;
			}

			// left sorted array
			if (nums[l] <= nums[mid]) {
				if (target < nums[mid] && target >= nums[l]) {
					r = mid - 1;
				} else {
					l = mid + 1;
				}
			}
			// right sorted array
			else {
				if (target <= nums[r] && target > nums[mid]) {
					l = mid + 1;
				} else {
					r = mid - 1;
				}
			}
		}
		return -1;
	}

	
	///practice
	public static int searchNew(int[] nums, int target) {
		int l=0;int r=nums.length-1;
		while(l<=r){
			
			int mid=l+(r-l)/2;
			 if(nums[mid]==target)
				 return mid;
			 
			 //left sort portion
			 if(nums[l]<=nums[mid]){
				 if(target<nums[mid] && target>=nums[l])
					 r=mid-1;
				 else
					 l=mid+1;
			 }
			 //right portion
			 else{
				 if(target>=nums[r]&& target>nums[mid])
				 l=mid+1;
				 else
				 r=mid-1;
			 }
			 
				 
		}
		return -1;
	}

}
