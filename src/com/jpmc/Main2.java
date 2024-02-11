package com.jpmc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main2 {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    
    InputStreamReader reader1 = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in1 = new BufferedReader(reader1);
    
    String line = null;
    String line1;
    int count=1;
    String[] input1 = {};
    String[] input2 = {};
   while ((line = in.readLine()) != null && line.length()!= 0) { 
   /*String[] input = line.split(" "); 
  if (input.length == 2) { 
        System.out.println(calculateAnswer(input[0], input[1])); 
   } */
	   
	  // System.out.println("line:::  "+line);
	   if(count==1){
		 input1 = line.split(" ");
		//System.out.println("1");
		 System.out.println(Arrays.asList(input1));
	   }else if(count==2){
		 input2 = line.split(" ");
		// System.out.println("2");
		 System.out.println(Arrays.asList(input2));
	   }else{
		  // System.out.println("3");
		   break;
	   }
	   count++;
	   
    }
   /* while ((line = in.readLine()) != null) {
      System.out.println(line);
      char []ch=line.toCharArray();
      
      for (char c : ch) {
		System.out.println(c);
	}*/
      /*List<Integer> list=new ArrayList<>();
      list.add(Integer.valueOf(line));
      for (Integer integer : list) {
		System.out.println(integer);
	}*/
     
    		  
  //  }
   
   /* while ((line1 = in1.readLine()) != null) {
        System.out.println(line1);
        char []ch1=line1.toCharArray();
        
        for (char c : ch1) {
  		System.out.println(c);
  	} 
    
    }*/
    }
  
  public static boolean calculateAnswer(String input, String input2){
	  
      char []ch=input.toCharArray();
      
      for (char c : ch) {
		System.out.println(c);
	}
      char []ch1=input2.toCharArray();
      
      for (char c : ch1) {
		System.out.println(c);
	} 
      
      
	  return true;
	  
	  
  }
}