package InheritanceInSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeVehicle {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Komal\\eclipse-workspace\\serialization_deserialization\\src\\main\\java\\InheritanceInSerialization\\vehicle.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Vehicle v = (Vehicle)ois.readObject();
		
		System.out.println("read vehicle successfully!!!! \n\t"+ v);
	}
	
	

}
