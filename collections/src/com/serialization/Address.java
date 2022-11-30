package com.serialization;

import java.io.Serializable;

public class Address implements Serializable{
	
	private String city;
	private String state;
	private int pincode;
	
	public Address(String city, String state, int pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getPincode() {
		return pincode;
	}
	
	

}
