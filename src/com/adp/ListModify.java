package com.adp;

import java.util.ArrayList;
import java.util.List;

public class ListModify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>intList=new ArrayList<>();
		append(intList);
		System.out.println(intList.get(0));
	}
	
	public static void append(List list){
		list.add("0042");
		
		}

}
