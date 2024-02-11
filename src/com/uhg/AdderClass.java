package com.uhg;

import java.util.Scanner;

abstract class Calculator {
    abstract int add(int a, int b);
}
public class AdderClass {
	  public static void main(String[] args) {
	        int a, b;
	        try (Scanner scan = new Scanner(System.in)) {
	            a = scan.nextInt();
	            b = scan.nextInt();
	        }

	        Calculator adderObject = new Adder();
	        System.out.println("The sum is: " + adderObject.add(a, b));
	    }
	  
	 static class Adder extends Calculator{

			@Override
			int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
	    	
	    	
	    }
}
