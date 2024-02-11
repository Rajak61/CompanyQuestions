package com.datastructure.blind75.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingOnePass {
	public static void main(String[] args) {
		int a[] = { 3, 25, 5, 2 };
		int target = 8;
		int b[] = findTwoSum(a, target);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

	public static int[] findTwoSum(int[] a, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			int comp = target - a[i];
			if (map.containsKey(comp)) {
				return new int[] { map.get(comp), i };
			}
			map.put(a[i], i);
		}
		return null;

	}
}