package com.datastructure.greatlearning;

public class QuickSortImplementation {

	public static void main(String[] args) { //https://www.youtube.com/watch?v=OWCao3Ul6n4
		int a[] = { 2, 6, 3, 9, 5, 1 };
		quickSort(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void quickSort(int a[], int first, int last) {
		if (first < last) {
			int mid = partition(a, first, last);
			quickSort(a, first, mid - 1);
			quickSort(a, mid + 1, last);

		}
	}

	private static int partition(int[] a, int first, int last) {

		int pivot = a[last];
		int pIndex = first - 1;

		for (int j = first; j < last; j++) {

			if (a[j] <= pivot) {
				pIndex++;
				int temp = a[pIndex];
				a[pIndex] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[pIndex + 1];
		a[pIndex + 1] = a[last];
		a[last] = temp;

		return pIndex + 1;
	}

}
