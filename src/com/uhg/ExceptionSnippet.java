package com.uhg;

public class ExceptionSnippet {
public static void main(String[] args) {
	try{
		throw new Exc1();
	}catch(Exc0 e0){
		System.out.println("Exc0");
	}catch (Exception e) {
		System.out.println("");
	}
}

class Exc0 extends Exception{
	
}
class Exc1 extends Exc0{
	
}
}
