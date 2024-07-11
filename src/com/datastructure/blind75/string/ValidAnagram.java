package com.datastructure.blind75.string;

public class ValidAnagram {

	 //theory and code -https://www.youtube.com/watch?v=y6ht-CoRI4Q&ab_channel=NikhilLohia
    //time and space- 0(n) space 0(1)
	public static void main(String[] args) {

		String s =  "eat";
		String t="tea";
		System.out.println(anagram(s,t)); //use char array for count
		
	}

	private static boolean anagram(String s, String t) {
		// TODO Auto-generated method stub
		if(s.length()!=t.length())
			return false;

		int arr[]=new int[26];
		
		for(int i=0;i<s.length();i++){
			
		arr[s.charAt(i)-'a']++;
		arr[t.charAt(i)-'a']--;
			
		}
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]!=0){
				
				return false;
			}
		}
		return true;
	}

}
