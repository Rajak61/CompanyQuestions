package com.datastructure.greatlearning;

public class SelectionSortImplementation {

	public static void main(String[] args) {
		//int a[]={ 12, 11, 13, 5, 6 };
		int a[]={ 3,7,1,9,4,2,6 };
		selectionSort(a);

	}

	private static void selectionSort(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			 int minIndex=i;
			 
			 for (int j = i+1; j < a.length; j++) {
				if(a[j]<a[minIndex]){
					minIndex=j;
				}
			}
			 int temp=a[i];
			 a[i]=a[minIndex];
			 a[minIndex]=temp;
			 
			 
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
