package com.datastructure.blind75.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicates {
	
	public static void main(String[] args) {
		
		int nums[] = { 1, 2, 3, 1 };
		System.out.println(containDup(nums));
		System.out.println(containDuplicate(nums)); //recommended
	}
	
	public static boolean containDup(int[]nums){
		
		Map<Integer,Integer>map=new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			
			if(map.containsKey(nums[i])){
				map.put(nums[i], map.get(nums[i])+1);
			}else{
				map.put(nums[i],1);
			}
		}
		System.out.println(map);
		
		for(Map.Entry<Integer, Integer> map1: map.entrySet()){
			if(map1.getValue()>1){
				
				return true;
			}
			
		}
		return false;
	}
	
	public static boolean containDuplicate(int nums[]){//recommended
		Set<Integer> s=new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if(!s.add(nums[i])){
				return true;
			}
			
		}
		return false;
	}
}
