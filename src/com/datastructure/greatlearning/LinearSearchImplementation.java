package com.datastructure.greatlearning;

import java.util.Scanner;

public class LinearSearchImplementation {

	public static void main(String[] args) {
		int a1[]={3,5,6,7,8,9,2,3,5};
		System.out.println("enter no to be find!!");
		Scanner s1=new Scanner(System.in);
		int key=s1.nextInt();
		int count=0;
		for (int j = 0; j < a1.length; j++) {
			if(a1[j]==key){
				System.out.println("element found at index "+j);
				count++;
			}
		}
		if(count==0){
			System.out.println("element not found");
		}
		
		//s1.close();
	}

}
