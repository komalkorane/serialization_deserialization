package simpleserialdeserial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Komal\\eclipse-workspace\\serialization_deserialization\\std.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Komal kk = (Komal)ois.readObject();
		System.out.println("Deserialized komal "+kk);
		}
}
