package com.uhg;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class GFG 
{ 
     /* 
static int countDistinct(int arr[], int n) 
{ 
    int res = 1; 
  
    // Pick all elements one by one 
    for (int i = 1; i < n; i++)  
    { 
        int j = 0; 
        for (j = 0; j < i; j++) 
            if (arr[i] == arr[j]) 
                break; 
  
        // If not printed earlier,  
        // then print it 
        if (i == j) 
            res++; 
    } 
    return res; 
} 
  */
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45 ,7,8,8,45,54,45,45,45,8,7,9}; 
    int n = arr.length; 
    System.out.println(countNotDistinct(arr, n)); 
}

private static int countNotDistinct(int[] arr, int n) {
	// TODO Auto-generated method stub
	int count=0;
	Map<Integer,Integer>neMap=new HashMap<>();
	for(int i=0;i<arr.length;i++){
	if(neMap.containsKey(arr[i])){
		neMap.put(arr[i],neMap.get(arr[i])+1);
	}
	else{
		neMap.put(arr[i],1);
	}
	}
	System.out.println(neMap);
	
	Set<Entry<Integer, Integer>> entr=neMap.entrySet();
	for (Entry<Integer, Integer> entry : entr) {
		System.out.println(entry.getKey()+"---"+entry.getValue());
		if(entry.getValue()>1){
			count++;
		}
		}
	return count;
} 
} 