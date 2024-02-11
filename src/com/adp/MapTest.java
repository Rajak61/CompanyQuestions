package com.adp;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
public static void main(String[] args) {
	Map<Employee,String>newMap=new HashMap<>();
	newMap.put(new Employee("j"), "jhn");
	System.out.println(newMap.get(new Employee("j")));
	
}
}
