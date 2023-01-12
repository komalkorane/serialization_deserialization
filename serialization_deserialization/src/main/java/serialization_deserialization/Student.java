package serialization_deserialization;

import java.io.Serializable;

public class Student implements Serializable {

	 int roll;
	 transient String name;
	
	Student(){
		super();
	}
	Student(int roll, String name){
		this.roll=roll;
		this.name=name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll=roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String toString() {
		return "roll : "+roll+" "+"name : "+name;
	}
	
}
