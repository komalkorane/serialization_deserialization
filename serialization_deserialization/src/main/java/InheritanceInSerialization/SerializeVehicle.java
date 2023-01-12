package InheritanceInSerialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeVehicle {

	public static void main(String[] args) throws IOException {

		Vehicle v = new Vehicle();
		v.id=1234;
		v.no=111;
		v.comp="Creta";
		v.type="Mahindra";
		
//		File file = new File("aa.txt");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Komal\\eclipse-workspace\\serialization_deserialization\\src\\main\\java\\InheritanceInSerialization\\vehicle.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(v);
		
		System.out.println("write vehicle successfully!!!!!");
		
	}

}
