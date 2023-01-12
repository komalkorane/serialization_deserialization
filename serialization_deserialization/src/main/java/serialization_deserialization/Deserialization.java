package serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Komal\\eclipse-workspace\\serialization_deserialization\\src\\main\\java\\Student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student std = (Student)ois.readObject();
		System.out.println("Deseialized Student : "+std);
	}

}
