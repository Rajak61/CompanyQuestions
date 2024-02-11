package com.datastructure.blind75.interval;

import java.util.Arrays;


//Theory -https://www.youtube.com/watch?v=0TYKyTwGOAs
//code- https://www.youtube.com/watch?v=BW7LeuJIMhE
//Time-0(sort),space-0(sort)
public class NonOverlappingIntervals {

	public static void main(String[] args) {
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		System.out.println(Arrays.deepToString(removeOverLapIntervals(intervals)));
		
	}

}
