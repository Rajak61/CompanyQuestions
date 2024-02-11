package com.datastructure.greatlearning;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class SinglyLinkedList {

	public static void main(String[] args) {

		
		LinkedList<Integer>l1=new LinkedList<>();
		l1.add(2);
		l1.add(10);
		l1.add(6);
		l1.add(9);
		l1.add(2, 5);
		printLinkedList(l1);
		l1.remove();
		printLinkedList(l1);
		
		System.out.println("size-"+l1.size());
		System.out.println("find-"+l1.contains(2));
		
		Stack<String>s1=new Stack<>();
		LinkedList<String>l2=new LinkedList<>();
		
		s1.add("abc");
		s1.add("abc");
		s1.add("abc");
		
		l2.addAll(s1);
		printStringLinkedList(l2);
	}
	
	static void printLinkedList(LinkedList<Integer>l1){
		Iterator<Integer> i1=l1.iterator();
		while(i1.hasNext()){
			
			System.out.print(i1.next()+" ");
		}
		System.out.println();
		
		
	}
	static void printStringLinkedList(LinkedList<String>l1){
		Iterator<String> i1=l1.iterator();
		while(i1.hasNext()){
			
			System.out.print(i1.next()+" ");
		}
		System.out.println();
		
		
	}

}
