package com.pro.instncecontrolflow;

import java.io.Serializable;

public class Address extends Student implements Serializable{
	
	int pin;
	String city;
	public Address(int roll, String name, int pin, String city) {
		super(roll, name);
		this.pin = pin;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + ", roll=" + roll + ", name=" + name + "]";
	}
	
}
