package cm.amdocs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupicateArray {

	public static void main(String[] args) {

		String str = "ABCD";
		String stringdata[] = { "AABCDAA", "ABBCDA", "ABCDABCD", "ACDBDCA", "GFTSABCD" };

		// find continous non repeating char in stringdata and also check the
		// char each from str is in string data string
		getLongestString(str, stringdata);
	}
	static Set<String> stringSet=new HashSet<>();
	public static String getBiggestString(String str, String newString) {

		char[] strnw = str.toCharArray();
		for (char c : strnw) {
			if (!newString.contains(String.valueOf(c))) {

			} else {
				System.out.println("after check -- " + newString);

			}

		}
		return "";

	}

	public static String getLongestString(String str, String[] stringdata) {

		String nonDupString = "";

		for (String string : stringdata) {
			char[] strindatanew = string.toCharArray();

			for (int i = 0; i < strindatanew.length - 1; i++) {

				if (strindatanew[i] == strindatanew[i + 1]) {
					System.out.println("after remooving dup::" + string);
					// nonDupString=string;
					stringSet.add(string);
					getBiggestString(str, string);
					break;
				}
			}

		}

		return "";
	}
}
