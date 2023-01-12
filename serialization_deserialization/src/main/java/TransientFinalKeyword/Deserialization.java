package TransientFinalKeyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream f = new FileInputStream("C:\\Users\\Komal\\eclipse-workspace\\serialization_deserialization\\src\\main\\java\\TransientFinalKeyword\\komal.txt");
		
		ObjectInputStream i = new ObjectInputStream(f);
	Komal kk = (Komal)i.readObject();
	System.out.println(kk);
		System.out.println("Byyyyyy");
		
		
	}

}
