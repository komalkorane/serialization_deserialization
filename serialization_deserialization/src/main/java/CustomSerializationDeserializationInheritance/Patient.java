package CustomSerializationDeserializationInheritance;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Patient extends Hospital{

	String disease;
	transient String name;
	
	Patient(){
		super();
	}
	Patient(int id, String dept,String disease, String name){
		super(id,dept);
		disease=disease;
		name=name;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Patient [disease=" + disease + ", name=" + name + ", id=" + id + ", dept=" + dept + "]";
	}
	private void writeObject(ObjectOutputStream oos) throws NotSerializableException {
//		oos.defaultWriteObject();
//		String nm = 123+name;
//		oos.writeObject(nm);
		
		throw new NotSerializableException();
	}
	private void readObject(ObjectInputStream ois) throws NotSerializableException  {
//		ois.defaultReadObject();
//		String newnm =(String)ois.readObject();
//		name = newnm.substring(3);
		
		throw new NotSerializableException();
	}
	
	
}
