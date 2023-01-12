package ObjectGraphInSerialization;

import java.io.*;

public class Serialization {

	public static void main(String[] args) throws IOException {

		Address add= new Address(1234,"Pune");
		Student s = new Student(10,"Komal",add);
		
//		s.getAdd().setCity("Kolhapur");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("C:\\Users\\Komal\\eclipse-workspace\\serialization_deserialization\\src\\main\\java\\InheritanceInSerialization\\xyz.txt");
			oos=new ObjectOutputStream(fos);
			
			oos.writeObject(s);
			
			System.out.println("write successfully!!!!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			oos.close();
			fos.close();
		}
	}

}
