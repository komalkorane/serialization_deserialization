package simpleserialdeserial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException {

	Komal k = new Komal("Komal",25);
	FileOutputStream fos = new FileOutputStream("C:\\Users\\Komal\\eclipse-workspace\\serialization_deserialization\\std.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(k);
	System.out.println("File serialize successfully!!!");
		
		
		
	}

}
