package com.uhg;

public class ImplC extends BaseC implements BaseI{
public static void main(String[] args) {
	(new ImplC().method());
}


}
class BaseC{
	public void method(){
		System.out.println("Inside BaseC: method");
	}
}