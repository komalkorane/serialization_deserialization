package com.pro.custom;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomSerialization {

	public static void main(String[] args) throws IOException {

		AccountHolder ah = new AccountHolder("Gargoti",123456,10110007526l, "Komal", "komal@2206");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Komal\\eclipse-workspace\\serialization_deserialization\\src\\main\\java\\com\\pro\\custom\\bank.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(ah);
		
		System.out.println("Ac write successfully!!!!!");
		fos.close();
		oos.close();
		
	}

}
