package com.adp;

public class StringBuilderExample {
public static void main(String[] args) {
	 StringBuilder s=new StringBuilder("JAVA");
	 String s2="LOVE";
	 s.append(s2);
	 String sx=s.substring(4);
	 System.out.println(s);
	 System.out.println(sx);
	 int x=s.indexOf(s2);
	 System.out.println(x);
}
}
