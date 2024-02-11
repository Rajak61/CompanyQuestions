package com.datastructure.blind75.interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {

	//Time and space complexity- 0(n)
	//Theory and code -https://www.youtube.com/watch?v=FuLfL_WhUHI
	
	public static void main(String[] args) {
				
		 int[][] intervals={{1,3},{6,9}};
		 int [] newInterval={2,5};
		 
		 System.out.println(Arrays.deepToString(insert(intervals,newInterval)));
	}

	
	private static int[][] insert(int[][] intervals, int[] newInterval) {
		List<int[]>result=new ArrayList<>();
		int i=0,n=intervals.length;
		
		while(i<n && intervals[i][1]<newInterval[0])
			result.add(intervals[i++]);
		
		int []m=newInterval;
		while(i<n&& intervals[i][0]<=newInterval[1]){
			
			m[0]=Math.min(m[0],intervals[i][0]);
			m[1]=Math.max(m[1],intervals[i++][1]);
		}
		result.add(m);

		while(i<n)
			result.add(intervals[i++]);
		
		return result.toArray(new int [result.size()][2]);
	}


		
		
		
	
}
