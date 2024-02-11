package com.adp;

import java.util.HashMap;
import java.util.Map;

public class OcuurenceOfAlphabet {

	public static void main(String[] args) {

		String s = "aaggggyhhjekykjclqjpjqikjknn";
		char[] ch = s.toCharArray();

		Map<Character, Integer> newMap = new HashMap<>();
		for (char cha : ch) {
			if (newMap.containsKey(cha)) {

				newMap.put(cha, newMap.get(cha) + 1);
			} else {
				newMap.put(cha, 1);
			}

		}
		
		//Set<Entry<Character,Integer>> setnew=newMap.get(cha);
		System.out.println(newMap);
		
	}

}
