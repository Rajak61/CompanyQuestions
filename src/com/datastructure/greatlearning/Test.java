package com.datastructure.greatlearning;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		int a[]={ 12, 11, 13, 5, 6 };
		//int a[]={ 3,7,1,9,4,2,6 };
		insertionSort(a);
	}

	private static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j=i-1;
			
			while(j>=0&& key<a[j]){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}
//
//class Test{
//
//
//public static void getDuplicates(String[] s){
// 
// Map<String,Integer>map=new HashMap<>();
// for(int i=0;i<s.length;i++){
//	 
// if(map.get(s[i])==null){
//	 map.put(s[i],1);
//	}
//	 else{
//	 map.put(s[i],map.get(s[i])+1);
//	}
// }
// for(Map.Entry<String,Integer> map1:map.entrySet()){
//	 
//	 System.out.println(map1);
// }
//}
//
//public static void main(String args[]){
//
//String []s={"ccc","ww","spring","ccc","cc","ss","dd","dd"};
//
//getDuplicates(s);
//
//}
//
//}