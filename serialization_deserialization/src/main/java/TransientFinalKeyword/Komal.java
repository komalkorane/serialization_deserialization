package TransientFinalKeyword;

import java.io.Serializable;

public class Komal implements Serializable {

	String name;
	String city = "Mahalwadi";
	int roll;
	int age = 25;
	public Komal() {
		super();
	}
	public Komal(String name, String city, int roll, int age) {
		super();
		this.name = name;
		this.city = city;
		this.roll = roll;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Komal [name=" + name + ", city=" + city + ", roll=" + roll + ", age=" + age + "]";
	}
	
	
	
	
	
	
}
