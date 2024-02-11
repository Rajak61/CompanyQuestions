package com.datastructure.blind75.array;

import java.util.Arrays;

public class TripletSum {

	public static void main(String[] args) {
		int[] arr = { 11, 14, 1, 5, 7, 8 };
		System.out.println(Sum(arr, 13));
	}

	public static String Sum(int[] arr, int sum) {

		Arrays.sort(arr);// 1,5,7,8,11,14

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {

				for (int k = j+1; k < arr.length; k++) {
					if(arr[i]+arr[j]+arr[k]==13){

					System.out.println("no of sum::" + arr[i] + " " + arr[j] + " " + arr[k]);
					System.out.println("index of sum::" + i + " " + j + " " + k);
					return String.valueOf("index of num:: "+i+" "+j+" "+k);
					
					}

				}
			}
		}

		return "";
	}
}