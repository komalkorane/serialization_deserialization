package CustomSerializationDeserializationInheritance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import CustomSerializationDeserialization.Student;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Komal\\eclipse-workspace\\serialization_deserialization\\src\\main\\java\\CustomSerializationDeserializationInheritance\\patient.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
	
		Patient std = (Patient)ois.readObject();
		
		System.out.println("read Student Successfully!!!!!\t\n"+std);
		
	}

}
