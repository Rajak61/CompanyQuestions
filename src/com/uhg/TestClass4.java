package com.uhg;
/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 
 
class TestClass4 {
	static String nos[];
	   static ArrayList<Integer> set = new ArrayList<>();
	static boolean flag = false;
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         */
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        nos = br.readLine().split(" ");
        
        
        for(int i=0;i<nos.length;i++)
        {
        	set.add(Integer.parseInt(nos[i]));	
        }
        
    playA();
 
    }
    static int abs(int a)
    {
    	if(a<0)
    	return -1*a;
    	return a;
    }
    static void playA()
    {
    	for(int i=0;i<set.size()&&!flag;i++)
    		for(int j=0;j<set.size()&&!flag;j++)
    		if(i!=j&&!set.contains(abs (set.get(i)-set.get(j)) ) )
    		{
    			set.add(abs (set.get(i)-set.get(j)));
                        //System.out.println(abs (set.get(i)-set.get(j))+"added by A");
                        
    			flag = true;
                        
    		}
    		if(!flag)
    		{
    		System.out.println("Bob");
                    for (Integer x : set) {
                        //System.out.println(x);
                    }
    		System.exit(0);
    		}
    		else
    		flag = false;
    		
    		playB();
    		
    }
    static void playB()
    {
    	for(int i=0;i<set.size()&&!flag;i++)
    		for(int j=0;j<set.size()&&!flag;j++)
    		if(i!=j&&!set.contains(abs (set.get(i)-set.get(j)) ) )
    		{
    			set.add(abs (set.get(i)-set.get(j)));
                        //System.out.println(abs (set.get(i)-set.get(j))+"added by B");
    			flag = true;
    		}
    		if(!flag)
    		{
    		System.out.println("Alice");
                for (Integer x : set) {
                        //System.out.println(x);
                    }
    		System.exit(0);
    		}
    		else
    		flag = false;
    		
    		playA();
    		
    		 /*this is acooment ***/
    }
}