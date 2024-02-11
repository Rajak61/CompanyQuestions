package com.datastructure.greatlearning;

public class TestQuick {

	public static void main(String[] args) {
		int a[] = { 2, 6, 3, 9, 5, 1 };
		quickSort(a,0,a.length-1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

	private static void quickSort(int[] a, int low, int high) {
		if(low<high){
			int mid=partition(a,low,high);
			quickSort(a, low, mid-1);
			quickSort(a, mid+1, high);
		}
		
	}

	private static int partition(int[] a, int low, int high) {
		int pivot=a[high];
		int pIndex=low-1;
		for (int j = low; j < high; j++) {
			if(a[j]<=pivot){
				pIndex++;
				int temp=a[pIndex];
				a[pIndex]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[pIndex+1];
		a[pIndex+1]=a[high];
		a[high]=temp;
		
		return pIndex+1;
	}

}
