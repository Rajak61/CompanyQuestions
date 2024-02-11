package com.datastructure.greatlearning;

public class TestMegeSort {

	public static void main(String[] args) {
		int a[] = { 6, 3, 9, 5, 2, 8 };///apna college
		//int a[] = { 3, 5, 1, 7, 4, 9 };// great learning
		mergeSort(a, 0, a.length - 1);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	private static void mergeSort(int[] a, int si, int ei) {

		if (si < ei) {
			int mid = si + (ei - si) / 2;
			mergeSort(a, si, mid);
			mergeSort(a, mid + 1, ei);
			merge(a, si, mid, ei);
		}
	}

	private static void merge(int[] a, int si, int mid, int ei) {
		int merged[] = new int[ei - si + 1];
		int idx1 = si;
		int idx2 = mid + 1;
		int mIdx = 0;
		while (idx1 <= mid && idx2 <= ei) {
			if (a[idx1] <= a[idx2]) {
				merged[mIdx++] = a[idx1++];
			} else {
				merged[mIdx++] = a[idx2++];
			}
		}
		while (idx1 <= mid) {

			merged[mIdx++] = a[idx1++];
		}
		while (idx2 <= ei) {

			merged[mIdx++] = a[idx2++];
		}
		
		for (int i = 0,j=si; i < merged.length; i++,j++) {
			a[j]=merged[i];
		}
	}

}
