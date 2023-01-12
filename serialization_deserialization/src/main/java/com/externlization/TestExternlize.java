package com.externlization;

import java.io.FileNotFoundException;
import java.io.*;
import java.io.ObjectOutputStream;

public class TestExternlize {

	public static void main(String[] args) throws Exception {
		
		ExternlizeDemo ed=new ExternlizeDemo(10,"AAA");
		
		FileOutputStream fos=new FileOutputStream("aa.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(ed);
		
		System.out.println("Done.."); 
		
		
		FileInputStream fis=new FileInputStream("aa.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		ExternlizeDemo e=(ExternlizeDemo)ois.readObject();
		System.out.println(e);
	}

}
