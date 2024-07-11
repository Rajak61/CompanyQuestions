package com.datastructure.blind75.string;

import java.util.Stack;

public class ValidParnethesis {

	// https://www.youtube.com/watch?v=TaWs8tIrnoA&ab_channel=NikhilLohia
	// time0(n),space0(n)
	// It's brilliant. The basic idea is to push the right parentheses ')', ']',
	// or '}' into the stack each time when we encounter left ones.
	// And if a right bracket appears in the string, we need check if the stack
	// is empty and also whether the top element is the same with that right
	// bracket. If not, the string is not a valid one. At last, we also need
	// check if the stack is empty.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(){}]";
		System.out.println(parenthesis(s));
	}

	public static boolean parenthesis(String s) {

		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {

			if (c == '(') {
				stack.push(')');
			}
			else if (c == '{') {
				stack.push('}');
			}
			else if (c == '[') {
				stack.push(']');
			}
			
			else if(stack.isEmpty()||stack.pop()!=c){
				return false;
			}
			
		}
		return stack.isEmpty();
	}
}
