package com.datastructure.blind75.interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Time -O(nlogn), space-0(n)
//https://www.youtube.com/watch?v=hK_qN5UAAo4
public class MergeIntervals {

	public static void main(String[] args) {

		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		System.out.println(Arrays.deepToString(merge(intervals)));

	}

	private static int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

		List<int[]> result = new ArrayList<>();
		int start = intervals[0][0];
		int end = intervals[0][1];

		for (int[] i : intervals) {

			if (i[0] > end) {
				result.add(new int[] { start, end });
				start = i[0];
				end = i[1];
			} else {
				end = Math.max(end, i[1]);
			}
		}
		result.add(new int[] { start, end });
		return result.toArray(new int[result.size()][2]);
	}
}
