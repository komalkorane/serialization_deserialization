package com.pro.instncecontrolflow;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import CustomSerializationDeserializationInheritance.Patient;

public class DeserilizeFlow {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("C:\\Users\\Komal\\eclipse-workspace\\serialization_deserialization\\src\\main\\java\\com\\pro\\instncecontrolflow\\ab.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
	
		Address std = (Address)ois.readObject();
		
		System.out.println("read Student Successfully!!!!!\t\n"+std);
	}

}


