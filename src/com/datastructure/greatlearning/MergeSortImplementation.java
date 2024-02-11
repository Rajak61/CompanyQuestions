package com.datastructure.greatlearning;

public class MergeSortImplementation {// https://www.youtube.com/watch?v=unxAnJBy12Q

	public static void mergeSort(int[] a, int si, int mid, int ei) {

		int[] merged = new int[ei - si + 1];
		int li = si; // left index
		int ri = mid + 1; // right index
		int mi = 0; // final merged index

		while (li <= mid && ri <= ei) {
			if (a[li] <= a[ri]) {
				merged[mi++] = a[li++];
			} else {
				merged[mi++] = a[ri++];
			}
		}
		while (li <= mid) {

			merged[mi++] = a[li++];
		}
		while (ri <= ei) {

			merged[mi++] = a[ri++];
		}

		for (int i = 0, j = si; i < merged.length; i++, j++) {
			a[j] = merged[i];
		}
	}

	public static void quickSort(int[] a, int si, int ei) {

		if (si < ei) {

			int mid = si + (ei - si) / 2;

			quickSort(a, si, mid);
			quickSort(a, mid + 1, ei);
			mergeSort(a, si, mid, ei);
		}

	}

	public static void main(String[] args) {
		//int a[] = { 6, 3, 9, 5, 2, 8 };///apna college
		int a[]={3,5,1,7,4,9};//great learning
		// int length=a.length;
		quickSort(a, 0, a.length - 1);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
