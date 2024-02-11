package com.datastructure.blind75.binary;

public class SumOf1Bits {

	public static void main(String[] args) {
		 int n = 00000000000000000000000000001011;
		 System.out.println(sumOf1BitsUsingRecursion(n)); //https://www.youtube.com/watch?v=wLHhAHkID9M
		 System.out.println(sumOf1Bits(n)); ///neetcode--https://www.youtube.com/watch?v=5Km3utixwZs
	}

	private static int sumOf1Bits(int n) {  //read theory
		int res=0;
		while(n!=0){
			n=n&(n-1);
			res+=1;
		}
		return res;
	}

	private static int sumOf1BitsUsingRecursion(int n) {
		
		if(n==0)return 0;
		if(n==1) return 1;
		return sumOf1BitsUsingRecursion(n&(n-1))+1;
		
	}

	
	//theory and code--https://www.youtube.com/watch?v=5Km3utixwZs
	
}
