package com.datastructure.greatlearning;

import java.util.Iterator;
import java.util.Stack;

public class StackImplementaion {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		stack.push(2);
		stack.push(1);
		stack.push(7);
		stack.push(-1);
		stack.push(8);

		System.out.println(stack);

		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// System.out.println(stack);

		System.out.println(stack.isEmpty());

		System.out.println("peek --" + stack.peek());

		System.out.println("search-- " + stack.search(-1)); // works from top

		// iterate to modify the data
		Iterator<Integer> it = stack.iterator();

		while (it.hasNext()) {

			System.out.print(it.next() + ",");
		}
		System.out.println();
		System.out.println("size-" + stack.size());
		
		//System.out.println(stack.s);

	}

}
