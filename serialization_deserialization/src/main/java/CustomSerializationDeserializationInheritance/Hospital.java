package CustomSerializationDeserializationInheritance;

import java.io.Serializable;

public class Hospital implements Serializable {

	int id;
	String dept;
	
     Hospital(){
    	 super();
     }
	public Hospital(int id, String dept) {
		super();
		this.id = id;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Hospital [id=" + id + ", dept=" + dept + "]";
	}
	
	
	
}
