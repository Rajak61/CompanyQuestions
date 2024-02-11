package com.uhg;

public class X {
public static void main(String[] args) {
	try {
	badMethod();
	System.out.println("A");
	} catch (Exception e) {
		System.out.println("B");
		// TODO: handle exception
	}finally {
		System.out.println("C");
	}
	System.out.println("D");
}
public static void badMethod(){
	
}
}
