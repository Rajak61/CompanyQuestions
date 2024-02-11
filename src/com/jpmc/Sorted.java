package com.jpmc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Sorted {
	
	
	/* Java program to search an element 
	in a sorted and pivoted array*/

	
			
		/* Searches an element key in a 
		pivoted sorted array arrp[] 
		of size n */
		static int pivotedBinarySearch(int arr[], int n, int key) 
		{ 
		int pivot = findPivot(arr, 0, n-1); 
			
		// If we didn't find a pivot, then 
		// array is not rotated at all 
		if (pivot == -1) 
			return binarySearch(arr, 0, n-1, key); 
			
		// If we found a pivot, then first 
		// compare with pivot and then 
		// search in two subarrays around pivot 
		if (arr[pivot] == key) 
			return pivot; 
		if (arr[0] <= key) 
			return binarySearch(arr, 0, pivot-1, key); 
		return binarySearch(arr, pivot+1, n-1, key); 
		} 
		
		/* Function to get pivot. For array 
		3, 4, 5, 6, 1, 2 it returns 
		3 (index of 6) */
		static int findPivot(int arr[], int low, int high) 
		{ 
		// base cases 
		if (high < low) 
				return -1; 
		if (high == low) 
				return low; 
			
		/* low + (high - low)/2; */
		int mid = (low + high)/2; 
		if (mid < high && arr[mid] > arr[mid + 1]) 
			return mid; 
		if (mid > low && arr[mid] < arr[mid - 1]) 
			return (mid-1); 
		if (arr[low] >= arr[mid]) 
			return findPivot(arr, low, mid-1); 
		return findPivot(arr, mid + 1, high); 
		} 
		
		/* Standard Binary Search function */
		static int binarySearch(int arr[], int low, int high, int key) 
		{ 
		if (high < low) 
			return -1; 
			
		/* low + (high - low)/2; */	
		int mid = (low + high)/2; 
		if (key == arr[mid]) 
			return mid; 
		if (key > arr[mid]) 
			return binarySearch(arr, (mid + 1), high, key); 
		return binarySearch(arr, low, (mid -1), key); 
		} 
		
		// main function 
		static String[] input1 = {};
		static String[] input2 = {};
		
		private static int[] processLine(String[] strings) {
		    int[] intarray=new int[strings.length];
		    int i=0;
		    for(String str:strings){
		        intarray[i]=Integer.parseInt(str.trim());//Exception in this line
		        i++;
		    }
		    return intarray;
		}
		
		public static void main(String args[]) throws IOException 
		{ 
		readLine();
		// Let us search 3 in below array 
		//int arr1[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}; 
		int[] arr1=processLine(input1);
		int n = arr1.length; 
		int[] arr2=processLine(input2);
		//int key = 3; 
		for (int i = 0; i < arr2.length; i++) {
			int key=arr2[i];
			//System.out.println("Index of the element is : "+ pivotedBinarySearch(arr1, n, key)); 
			System.out.println("Index of the element is : "+ pivotedBinarySearch(arr1, n, key)); 
		}
		} 

	public static void readLine() throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line = null;
		int count = 1;
		
		while ((line = in.readLine()) != null && line.length() != 0) {
			/*
			 * String[] input = line.split(" "); if (input.length == 2) {
			 * System.out.println(calculateAnswer(input[0], input[1])); }
			 */

			// System.out.println("line::: "+line);
			if (count == 1) {
				input1 = line.split(" ");
				// System.out.println("1");
				System.out.println(Arrays.asList(input1));
			} else if (count == 2) {
				input2 = line.split(" ");
				// System.out.println("2");
				System.out.println(Arrays.asList(input2));
			} else {
				// System.out.println("3");
				break;
			}
			count++;

		}
	}
	} 

