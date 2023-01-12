package serialization_deserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException {

		Student s = new Student(10,"Ram");
		FileOutputStream file= null;
		ObjectOutputStream oos = null;
		
		file = new FileOutputStream("C:\\Users\\Komal\\eclipse-workspace\\serialization_deserialization\\src\\main\\java\\Student.txt");
		oos = new ObjectOutputStream(file);
		oos.writeObject(s);
		System.out.println("Student object serialized successfully!!!!!");
		
		file.close();
		oos.close();
		
	}

}
