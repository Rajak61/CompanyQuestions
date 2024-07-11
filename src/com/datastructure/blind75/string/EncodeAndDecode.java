package com.datastructure.blind75.string;

import java.util.List;
import java.util.ArrayList;
// Theory -https://www.youtube.com/watch?v=B1k_sxOSgv8&ab_channel=NeetCode
//code- https://walkccc.me/LeetCode/problems/271/#__tabbed_1_2
// Time 0(n), space 0(n)
public class EncodeAndDecode {

	public static void main(String[] args) {
		String s1 = "Need";
		String s2 = "Coding";
		List<String> ls = new ArrayList<>();
		ls.add(s1);
		ls.add(s2);
		//System.out.println(encode(ls));
		//System.out.println(decode(encode(ls)));
		System.out.println(encodeWalkCC(ls));
		System.out.println(decodeWalkCC(encodeWalkCC(ls)));
		System.out.println("ram".substring(0,2));
	}

	public static String encode(List<String> strs) {
		StringBuilder res = new StringBuilder();
		for (String s : strs) {
			res.append(s.length()).append("#").append(s);
		}
		return res.toString();
	}

	public static List<String> decode(String str) {
		List<String> res = new ArrayList<>();
		int i = 0;
		while (i < str.length()) {
			int j = i;
			while (str.charAt(j) != '#') {
				j++;
			}
			int length = Integer.parseInt(str.substring(i, j));
			res.add(str.substring(j + 1, j + 1 + length));
			i = j + 1 + length;
		}
		return res;
	}

	///https://walkccc.me/LeetCode/problems/271/#__tabbed_1_2
	public static String encodeWalkCC(List<String> strs) {
		StringBuilder encoded = new StringBuilder();

		for (final String s : strs)
			encoded.append(s.length()).append('/').append(s);

		return encoded.toString();
	}

	// Decodes a single string to a list of strings.
	public static  List<String> decodeWalkCC(String s) {
		List<String> decoded = new ArrayList<>();

		for (int i = 0; i < s.length();) {
			final int slash = s.indexOf('/', i);
			final int length = Integer.parseInt(s.substring(i, slash));
			i = slash + length + 1;
			decoded.add(s.substring(slash + 1, i));
		}

		return decoded;
	}

}
