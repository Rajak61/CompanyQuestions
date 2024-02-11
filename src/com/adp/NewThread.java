package com.adp;

public class NewThread {
Thread t;
String name;
NewThread(String threadName){
	name=threadName;
	t=new Thread(this.name);
	t.start();
}
public void run(){
	
}
}
