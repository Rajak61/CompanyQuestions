package com.adp;

public class Calculator {

	int num = 100;

	public void calc(int num) {
		this.num = num * 10;
	}

	public void printNum() {
		System.out.println(num);

	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.calc(2);
		c.printNum();
	}
}
