package com.datastructure.blind75.binary;

public class ReverseBits {

	public static void main(String[] args) { //https://www.youtube.com/watch?v=vy288ZcbWRc
		//https://www.youtube.com/watch?v=-5z9dimxxmI
		
		Integer  n = 0010010;
		System.out.println(reverseBits(n)); //java issue--https://www.tutorialspoint.com/java-program-to-reverse-bits-of-a-positive-integer-number

	}

	private static int reverseBits(int n) {
		
		int res=0;
		for (int j = 0; j <32; j++) {
			res<<=1;
			res=res|(n&1);
			n>>=1;
		}
		return res;
	}
	
	

}
