package com.amazon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CodilityTest {

	public static void main(String[] args) {
		// 
		
		//int a[]={1,-1 ,3, 6, 4, 1, 2};
		//int a[]={1, 2, 3};
		int a[]={-1,-3};
		System.out.println(solution(a));

	}
	
	
	 public static int solution(int[] A) {
	        // write your code in Java SE 84
	        int length=A.length;
	        int data = 0;
	       // System.out.println(length);
	        Arrays.sort(A);
	        Set<Integer>sort=new HashSet<>();
	        
	        for (int i : A) {
	        	if(i>0){
	        		
	        		//System.out.println(i);
	        		sort.add(i);
	        	}
	        	
	        }
	        
	        for(int i=1;i<length+1;i++){
	        	if(!sort.contains(i)){
	        		//return i;
	        		data=i;
	        		break;
	        	}
	        	
	        }
	        if(data==0){
	        	data=length+1;
	        }
	        return data;
	        //return length;
	    }

}
