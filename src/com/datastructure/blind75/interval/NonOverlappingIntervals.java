package com.datastructure.blind75.interval;

import java.util.Arrays;
import java.util.List;

//Theory -https://www.youtube.com/watch?v=0TYKyTwGOAs
//code- https://www.youtube.com/watch?v=BW7LeuJIMhE
//Time-0(sort),space-0(sort)
public class NonOverlappingIntervals {

	public static void main(String[] args) {
		int[][] intervals = {{1,2},{1,2},{1,2} };
		System.out.println(eraseOverlapIntervals(intervals,0));

	}

	private static Object[] removeOverLapIntervals(int[][] intervals) {
		return new Object[] {};

	}

	public static int eraseOverlapIntervals(int[][] arr, int sum) {//Theory code 

		Arrays.sort(arr,(a,b)->(a[0]-b[0]));
		int n = arr.length;

		int i = 1;
		int[] L = arr[0];

		while (i < n) {
			int cur_start = arr[i][0];
			int cur_end = arr[i][1];

			int last_end = L[1];

			if (cur_start >= last_end) {// safe
				L = arr[i];
			} else if (cur_end >= last_end) {
				sum++;
			} else if (cur_end < last_end) {
				L = arr[i];

			}
			i++;
		}
		return sum;
	}
}