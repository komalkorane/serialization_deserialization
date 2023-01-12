package CustomSerializationDeserialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {

	int roll;
	String name;
	transient String Pwd;

	public Student(int roll, String name, String Pwd) {
		super();
		this.roll = roll;
		this.name = name;
		this.Pwd = Pwd;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return Pwd;
	}

	public void setPwd(String Pwd) {
		this.Pwd = Pwd;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", Pwd=" + Pwd + "]";
	}

	private void writeObject(ObjectOutputStream oos) throws IOException {

		oos.defaultWriteObject();

		String hide = "123" + Pwd;

		oos.writeObject(hide);
		System.out.println("Hide pwd : " + hide);

	}

	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {

		ois.defaultReadObject();

		String show = (String) ois.readObject();

		Pwd = show.substring(3);
		System.out.println("Show : " + Pwd);

	}

}
