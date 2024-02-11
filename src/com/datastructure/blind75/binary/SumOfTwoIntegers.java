package com.datastructure.blind75.binary;

public class SumOfTwoIntegers {

	public static void main(String[] args) { // therory--https://www.youtube.com/watch?v=gVUrDV4tZfY
		// code--https://cheonhyangzhang.gitbooks.io/leetcode-solutions/content/371-sum-of-two-integers.html
		int a = 2;
		int b = 3;
		System.out.println(getSumOfInt(a, b));

	}

	public static int getSumOfInt(int a, int b) {
		if (a != 0 && b != 0) {

			int and = a & b;
			int xor = a ^ b;
			a = and << 1;
			b = xor;
		}
		if (a != 0) {
			return a;
		} else {
			return b;
		}

	}

	//practice
	public static int getSum(int a, int b) {
		if (a != 0 && b != 0) {
			int and = a & b;
			int xor = a ^ b;

			a = and << 1;
			b = xor;
		}
		if (a != 0) {
			return a;
		} else {
			return b;
		}
	}
}

/**
 * 
 * 0001 0010 0000 --and
 * 
 * 0011 -xor
 * 
 * 0000--a 0011--b b -ans
 * 
 */

/*
 * 00
 * 
 * 
 * 
 * 
 */