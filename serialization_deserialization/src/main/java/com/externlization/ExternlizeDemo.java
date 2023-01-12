package com.externlization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternlizeDemo implements Externalizable {

	transient int roll;
	String name;

	public ExternlizeDemo(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public ExternlizeDemo() {
		super();
	}

	public String toString() {
		return "ExternlizeDemo [roll=" + roll + ", name=" + name + "]";
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("Hii");
		out.writeInt(roll);
//		out.writeUTF(name);
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		roll=in.readInt();
//		name=in.readUTF();
	}

}
