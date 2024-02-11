package com.uhg;
import java.util.*;
import java.util.regex.*;


public class Test5 {

	public static void main(String[] args) {Scanner in = new Scanner(System.in);
    //int size = Integer.parseInt(in.nextLine());
  //  for (int i = 0; i < size; i++) {
        char[] str = in.nextLine().toCharArray();
        Stack<Character> stack = new Stack<Character>();
        String result = null;
        String oResult = "true";
        for (int j = 0; j < str.length; j++) {
            if (stack.size() > str.length - j) {
                result = "NO_ELEMENT";
                break;
            }
            switch (str[j]) {
            case '{':
            case '[':
            case '(':
                stack.push(str[j]);
                break;

            case '}':
                if (!stack.empty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    result = "NO_ELEMENT";
                }
                break;

            case ']':
                if (!stack.empty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    result = "NO_ELEMENT";
                }
                break;

            case ')':
                if (!stack.empty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    result = "NO_ELEMENT";
                }
                break;
            }
            if (result == "NO_ELEMENT") {
                oResult = "false";
                break;
            }
        }
        if (stack.size() > 0) {
            oResult = "false";
        }
        System.out.println(oResult);
        oResult = "true";
    //}
    in.close();
}

}
