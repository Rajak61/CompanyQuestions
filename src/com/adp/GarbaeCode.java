package com.adp;

import java.util.HashMap;
import java.util.Map;

public class GarbaeCode {
public static void main(String[] args) {
	Map<String,String>neMap=new HashMap<>();
	String key1=new String();
	neMap.put(key1, "john");
	key1=null;
	System.gc();
	System.out.println(neMap.get(key1));
			
	
}
}
