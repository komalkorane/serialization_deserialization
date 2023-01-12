package CustomSerializationDeserializationInheritance;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException {

		Patient p = new Patient();
		p.setDept("Dengue");
		p.setDisease("fever");
		p.setId(1234);
		p.setName("AAAA"); 
		System.out.println(p);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Komal\\eclipse-workspace\\serialization_deserialization\\src\\main\\java\\CustomSerializationDeserializationInheritance\\patient.txt");
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(p);
	    System.out.println("Patient write successfully!!!!");
	
	}

}
