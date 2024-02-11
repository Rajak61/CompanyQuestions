package com.datastructure.blind75.binary;

public class CountingBits {

	public static void main(String[] args) {// kernighan algorithm
		// TODO Auto-generated method stub
		// //theory--https://www.youtube.com/watch?v=dwjjhbwNJxM
		
		// recommended --//Theory also
		// --code--https://www.youtube.com/watch?v=iuqr5hHk2MI ---

		int n = 5;
		int[]num=getcbits(n);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}

	public static int[] countBits(int n) {   //do this also -https://www.geeksforgeeks.org/java-program-for-count-set-bits-in-an-integer/
											// https://www.codingninjas.com/codestudio/library/count-number-of-set-bits-in-an-integer
		int num[] = new int[n + 1];
		for (int i = 0; i <= n; i++) {

			num[i] = num[i >> 1] + i % 2;
		}

		return num;
	}
	
	
	//pracice 
	public static int[] getcbits(int n){
		
		int num[]=new int[n+1];
		for (int i = 0; i <= n; i++) {
			num[i]=num[i>>1];
			int j=i%2;
			num[i]=num[i]+j;
		}
	return num;
	}
	
}
