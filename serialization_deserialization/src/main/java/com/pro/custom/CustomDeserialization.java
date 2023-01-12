package com.pro.custom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CustomDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		
		FileInputStream fis = new FileInputStream("C:\\Users\\Komal\\eclipse-workspace\\serialization_deserialization\\src\\main\\java\\com\\pro\\custom\\bank.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		AccountHolder ac = (AccountHolder)ois.readObject();
		
		System.out.println("Ac read successfully!!!!!  "+ac);
		fis.close();
		ois.close();
	}

}
