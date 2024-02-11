package com.datastructure.greatlearning;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapImplementation {

	public static void main(String[] args) {

		Map<String,Integer>map=new HashMap<>();
		map.put("ram", 2);
		map.put("ramaya", 22);
		map.put("ruy", 24);
		
		Set<String>set=map.keySet();
		for(String s:set){
			
			System.out.println(s+"-"+map.get(s));
		}
		System.out.println();
		Set<Map.Entry<String, Integer>> entry=map.entrySet();
		for(Map.Entry<String , Integer> en:entry){
			System.out.println(en.getKey()+"-"+en.getValue());
			
		}
	}

}
