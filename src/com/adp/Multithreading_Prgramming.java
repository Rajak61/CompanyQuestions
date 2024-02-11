package com.adp;

public class Multithreading_Prgramming {

	public static void main(String[] args) {
		NewThread bj1=new NewThread("one");
		NewThread obj2=new NewThread("two");
		try {
			bj1.t.wait();
			System.out.println(bj1.t.isAlive());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("main thread interrupt");
		}
	}
}
