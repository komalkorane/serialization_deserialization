package com.pro.instncecontrolflow;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeFlow {

	public static void main(String[] args) throws Exception {

		Address add = new Address(1, "Komal", 123, "Pune");

		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\Komal\\eclipse-workspace\\serialization_deserialization\\src\\main\\java\\com\\pro\\instncecontrolflow\\ab.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(add);
		System.out.println("Patient write successfully!!!!");
	}

}
