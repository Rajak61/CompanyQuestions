package com.datastructure.blind75.graph;

import java.util.HashMap;
//time and space -0(n)

public class LongestConsecutiveSequence {

	// theory and code-https://www.youtube.com/watch?v=AGb52zpOBvc -recommended
	// theory -https://www.youtube.com/watch?v=P6RZZMu_maU -neetcode
	// short code-https://walkccc.me/LeetCode/problems/0128/
	//Time -O(n),space-0(n)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 100, 4, 200, 1, 3, 2 };
		System.out.println(findLCS(nums));
	}

	public static int findLCS(int[] nums) {

		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], true);
		}

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i] - 1)) {
				map.put(nums[i], false);
			}
		}

		int max = 0;

		for (Integer key : map.keySet()) {
			if (map.get(key) == true) {
				max = Math.max(max, findlength(map, key));
			}

		}
			 
		return max;

	}

	private static int findlength(HashMap<Integer, Boolean> map, Integer key) {
		int ans=0;
		
		while(map.containsKey(key)){
			key++;
			ans++;
		}
		return ans;
	}

}
