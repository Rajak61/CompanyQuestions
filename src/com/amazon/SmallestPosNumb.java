package com.amazon;

import java.util.HashSet;
import java.util.Set;

public class SmallestPosNumb {
	
	
	public static int solution(int[] A) {
		int k=0;
		int N = A.length;
		Set<Integer> set = new HashSet<>();
		for (int a : A) {
		    if (a > 0) {
		        set.add(a);
		    }
		}
		for (int i = 1; i <= N + 1; i++) {
		    if (!set.contains(i)) {
		    	k=i;
		        return i;
		    }
		}
		return k;
	}


	public static void main(String[] args) {
	
		int arr[] = { 0, 10, 2, -10, -20 };
		int arr_size = arr.length;
		int missing = solution(arr);
		System.out.println("The smallest positive missing number is " + missing);
	}
}
