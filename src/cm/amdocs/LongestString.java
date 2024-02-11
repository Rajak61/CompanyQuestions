package cm.amdocs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LongestString {

	public static void main(String[] args) {
	
	String[] stringArray = new String[] { "AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCA" };
	String s="ABCD";
	String s1=getLongestString(stringArray,s);
	System.out.println(s1);
	
	}
	public  static String getLongestString(String[]stringArray,String s){
		


		List<String>strList=new ArrayList<>();
		Map<String, Integer> hashMap = new HashMap<>();
		int index = 0;
		for (String string : stringArray) {

			if (checkString(s, string)) {
				hashMap.put(string, string.length());
			}

			int maxValue = 0;
			String largestString = null;
			for (Entry<String, Integer> entrySet : hashMap.entrySet()) {
				if (entrySet.getValue() > maxValue) {
					maxValue=entrySet.getValue();
					largestString = entrySet.getKey();
					strList.add(largestString);
				}
			}
			//System.out.println(largestString);
		}
		int largestString = strList.get(0).length();
		 for(int i = 0; i < strList.size(); i++)
	        {
	            if(strList.get(i).length() > largestString)
	            {
	                largestString = strList.get(i).length();
	                                index = i;
	            }
	        }
	        //System.out.println("Index " + index + " "+ strList.get(index) + " " + "is the largest and is size " + largestString);
		// System.out.println(strList.get(index) /*+ " " + "is the largest and is size " + largestString*/);
		return strList.get(index);

	
	}

	public static boolean checkString(String newString, String original) {

		char temp = 0;
		for (char origChar : original.toCharArray()) {
			if (origChar == temp)
				return false;
			else
				temp = origChar;
			if (!newString.contains(String.valueOf(origChar)))
				return false;

		}
		return true;
	}

}
