package com.serialization;

import java.io.Serializable;

public class Person implements Serializable{
	private int id;
	private String name;
	private double salary;
	
	private transient int age;
	private Address address;

	 private static final long serialVersionUID = 1L;
	public Person(int id, String name, int age,double salary,Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age=age;
		this.address=address;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	
	

}
