package InheritanceInSerialization;

import java.io.Serializable;

public class Engine implements Serializable {

	String type;
	int id;
	
	Engine(){
		super();
	}
	Engine(String type, int id){
		this.type=type;
		this.id=id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Engine [type=" + type + ", id=" + id + "]";
	}
	
	
}
