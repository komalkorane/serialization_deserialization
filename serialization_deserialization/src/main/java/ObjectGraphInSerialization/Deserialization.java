package ObjectGraphInSerialization;

import java.io.*;

public class Deserialization {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Komal\\eclipse-workspace\\serialization_deserialization\\src\\main\\java\\InheritanceInSerialization\\xyz.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s = (Student)ois.readObject();
		
		System.out.println("Read successfully!!!! "+s);
		
		
	}

}
