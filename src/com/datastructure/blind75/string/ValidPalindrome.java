package com.datastructure.blind75.string;

public class ValidPalindrome {
	// theory
	// -https://www.youtube.com/watch?v=UXVHeXNO9AA&ab_channel=NikhilLohia
	// code-
	// https://leetcode.com/problems/valid-palindrome/discuss/3165353/Beats-96.9-oror-Well-Explained-Code-in-JAVA
	// time -0(n) ,space 0(1)
	public static void main(String[] args) {

		String s = "A man, a plan, a canal: Panama";
		System.out.println(palindrome(s));
	}

	public static boolean palindrome(String s) {

		if (s.isEmpty()) {

			return true;
		}

		int start = 0;
		int end = s.length() - 1;

		while (start <= end) {

			char first = s.charAt(start);
			char last = s.charAt(end);
			if (!Character.isLetterOrDigit(first)) {

				start++;
			} else if (!Character.isLetterOrDigit(last)) {

				end--;
			} else {
				if (Character.toLowerCase(first) != Character.toLowerCase(last)) {
					return false;

				}
				start++;
				end--;
			}
		}
		return true;
	}

}
