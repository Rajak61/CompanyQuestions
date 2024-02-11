package com.datastructure.makemytrip;

public class FindExcelColumnNameFromAGivenColumnNumber {

	public static void main(String[] args) {

		System.out.println(getColumnString(701));
	}

	private static String getColumnString(int n) {//this one  //https://www.youtube.com/watch?v=UcTKk2y_3s4
													///check this video --https://www.youtube.com/watch?v=sU9tlwO7czM
		String res = "";
		while (n != 0) {
			int temp = (n - 1) % 26;
			res=(char)('A'+temp)+res;
			n=(n-1)/26;
		}
		return res;
	}

	static String getColumnname(int n){
		
		String res="";
		while(n!=0){
			
			int temp=(n-1)%26;
			res=(char)(temp+'A')+res;
			n=(n-1)/26;
		}
		return res;
	}
}
