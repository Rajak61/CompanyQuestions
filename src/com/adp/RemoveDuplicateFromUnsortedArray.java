package com.adp;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateFromUnsortedArray {
 
	public static void main(String[] args) {
		
		int a[]={59,59,985,589,00,87,565,87,565,66};
		
		Map<Integer,Boolean>newMap=new HashMap<>();
		for (int j=0;j<a.length;j++) {
			 
			if(!newMap.containsKey(a[j])){
				newMap.put(a[j], true);
			
			}
		}
		System.out.println(newMap.keySet());
		
	}
 
}
