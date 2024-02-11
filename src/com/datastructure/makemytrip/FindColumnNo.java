package com.datastructure.makemytrip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FindColumnNo {
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		int t = Integer.parseInt(br.readLine());
//
//		while (t > 0) {
//			String s = br.readLine();
//			Solution T = new Solution();
//
//			System.out.println(T.excelColumnNumber(s));
//
//			t--;
//		}
		Solution T = new Solution();
		System.out.println(T.excelColumnNumber("CDA"));
		
		
	}

} 


class Solution {
	public int excelColumnNumber(String s) {//https://www.youtube.com/watch?v=_NqvWkRN3Dc
		int result = 0;
		for (int i = 0; i < s.length(); i++) {

			result = result * 26 + (s.charAt(i) - 'A' + 1); //value of"A" is 65 acii so for B--> 66-65=1 so add 1+1=B

		}
		return result;
	}

}
