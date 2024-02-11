package com.datastructure.geeksforgeeks;

public class FibonacciSeries {

	// https://www.scaler.com/topics/fibonacci-series-in-c-using-recursion/
	public static void main(String[] args) {
		int n = 4;
		for (int i = 0; i < n; i++) {
			System.out.println(recursion(i));
		}

		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.println(dynamic(i));
		}
	}

	static int recursion(int n) { // time -0(2*n) space-0(N)

		if (n <= 1) {
			return n;
		} else {
			return (recursion(n - 1) + recursion(n - 2));
		}
	}

	// dynamic or iterative
	static int dynamic(int num) { // time -0(N) space-0(1)
		int first = 0;
		int second = 1;
		int res;
		if (num == 0)
			return first;
		else if (num == 1)
			return second;

		for (int i = 1; i < num; i++) {// 0 1 1 2
			res = first + second;
			first = second;
			second = res;

		}
		return second;

	}
}
