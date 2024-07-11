package com.datastructure.blind75.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	//time 0(m*n) ,space 0(n)
    //theory -https://www.youtube.com/watch?v=C9V66KyZCP8&ab_channel=NikhilLohia
    //code-https://leetcode.com/problems/group-anagrams/discuss/19176/Share-my-short-JAVA-solution
	public static void main(String[] args) {

		String str[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(anagram(str)); //use char array for count
		//System.out.print(useStringbilder());// to count string and count -//theory -https://www.youtube.com/watch?v=C9V66KyZCP8&ab_channel=NikhilLohia
	}

	public static List<List<String>> anagram(String[] s) {

		Map<String, List<String>> map = new HashMap<>();
		if (s == null || s.length == 0) {
			return new ArrayList<>();
		}

		for (String str : s) {
			char arr[] = new char[26]; // /take character array
			// eat
			// convert to char array
			for (char ch : str.toCharArray()) {
				// e
				arr[ch - 'a']++;
			}
			// convert arr to string
			String arrString = String.valueOf(arr);
			// check map conditon
			if (!map.containsKey(arrString)) {
				map.put(arrString, new ArrayList<>());
			}
			map.get(arrString).add(str);
		}
		return new ArrayList<>(map.values());
	}
	
	
	
	public String getFreqCount(String s){
	
		//req bucket
		
		int[] freq=new int[26]; // use above char array or here int array
		
		for(char ch:s.toCharArray()){
			
			freq[ch-'a']++;
			
		}
		char c='a';
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<freq.length;i++){
			sb.append(c);
			sb.append(freq[i]);
			
		}
		return sb.toString();
	}
}





