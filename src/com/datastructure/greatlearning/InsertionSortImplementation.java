package com.datastructure.greatlearning;

public class InsertionSortImplementation { //https://www.geeksforgeeks.org/insertion-sort/

	
	public static void main(String[] args) {
	//int a[]={ 12, 11, 13, 5, 6 };
	int a[]={ 3,7,1,9,4,2,6 };
	insertSort(a);
	}

	private static void insertSort(int[] a) {
		
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j=i-1;
			
			while(j>=0 && key<a[j]){
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			
		}
		
	}
}
