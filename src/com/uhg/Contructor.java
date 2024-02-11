package com.uhg;

public class Contructor {
static String str;

public void Contructor(){
	System.out.println("In constructor");
	str="Hello World";
}
public static void main(String[] args) {
	Contructor c=new Contructor();
	System.out.println(str);
}
}
