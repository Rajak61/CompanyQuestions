


package com.adp;

public class PalindromeTrueOrFalse {

	public static void main(String[] args) {

		checkPalindrome("GeeksforGeeks");
		checkPalindrome("malayalam");

	}

	public static void checkPalindrome(String s) {
		String newString = new StringBuffer(s).reverse().toString();
		if (newString.equals(s)) {
			System.out.println(s + " is palindrome");

		}else{
			System.out.println(s + " is not palindrome");
		}

	}

}
