package com.uhg;

import java.util.Arrays;

public class StringSplit {
public static void main(String[] args) {
	String sentence="Hi, this is interesting,What do u say man, don't you think?";
	String s1[]=sentence.split(",");
	System.out.println(Arrays.asList(s1));
	String []s=sentence.split(" ");
	System.out.println(Arrays.asList(s));
}
}
