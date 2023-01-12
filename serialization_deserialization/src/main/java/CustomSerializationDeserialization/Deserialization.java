package CustomSerializationDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("std.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
	
		Student std = (Student)ois.readObject();
		
		System.out.println("read Student Successfully!!!!!\t\n"+std);
	}

}
