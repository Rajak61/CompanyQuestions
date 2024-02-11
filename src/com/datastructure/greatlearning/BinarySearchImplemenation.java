package com.datastructure.greatlearning;

import java.util.Arrays;

public class BinarySearchImplemenation {

	public static int binarySearch(int a[], int key, int first, int last) {
		if (first <= last) {

			int middle = (first + last) / 2;
			if (key == a[middle]) {
				return middle;
			} else if (key < a[middle]) {
				return binarySearch(a, key, first, middle - 1);
			} else if (key > a[middle]) {
				return binarySearch(a, key, middle + 1, last);
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int a[] = { 1, 4, 5, 6, 79, 3, 65, 45, 295, 56, 2 };
		// int a[]={1,3,5,6,8,9};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		// System.out.println(Arrays.deepToString(a));
		int key = 56;
		int index = binarySearch(a, key, 0, a.length - 1);
		if (index == -1) {
			System.out.println(key + " not found");
		} else {
			System.out.println(key + " found at index " + index);
		}

	}

}
