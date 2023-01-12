package TransientFinalKeyword;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException {

		Komal k = new Komal("komal","AAA",10,20);
		
		
		FileOutputStream f = new FileOutputStream("C:\\Users\\Komal\\eclipse-workspace\\serialization_deserialization\\src\\main\\java\\TransientFinalKeyword\\komal.txt");
		
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(k);
		
		System.out.println("hiiiiii");
		
		
	}

}
