package com.adp;

public class HappyGarbage01 {

	public static void main(String[] args) {
		HappyGarbage01 h=new HappyGarbage01();
		h.methodA();//line6
	}
	Object methodA(){//7
		Object obj1=new Object();//8
		Object[] obj2=new Object[1];//9
		obj2[0]=obj1;//10
		obj1=null;//11
		return obj2[0];
		
	}
}
