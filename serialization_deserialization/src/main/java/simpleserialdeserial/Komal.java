package simpleserialdeserial;

import java.io.Serializable;

public class Komal implements Serializable{

	
	String name;
	int age;
	public Komal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Komal() {
		super();
	}
	@Override
	public String toString() {
		return "Komal [name=" + name + ", age=" + age + "]";
	}
	
	
}
