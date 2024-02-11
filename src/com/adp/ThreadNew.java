package com.adp;

public class ThreadNew extends Thread
{
public static void main(String[] args) {
	ThreadNew t=new ThreadNew();
	t.start();
	t.stop();
	t.start();
}
public void run(){
	System.out.println("Hello...");
	
}
}
