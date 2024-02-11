package com.adp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serilization {

	public static void main(String[] args) {
		try {
			MyClass objet1=new MyClass("Hello",-7,1e10);
			FileOutputStream fos=new FileOutputStream("serial");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(objet1);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			
			System.out.println("serilaization in ex"+e);
			System.exit(0);
		}
		try {
			MyClass obj2;
			FileInputStream fis=new FileInputStream("serial");
			ObjectInputStream ois=new ObjectInputStream(fis);
			obj2=(MyClass)ois.readObject();
			ois.close();
			System.out.println(obj2);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("deserilaization in ex"+e);
			System.exit(0);
		}
	}
}
