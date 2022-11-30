package com.reduceMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {

	int id;
	String name;
	char gender;

	double salary;

	public Person(int id, String name, char gender, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}

	public static List<Person> allPerson(){
		
		List<Person> p=new ArrayList<>();
		Person p1=new Person(502,"Yamini",'F',46520.2);
		Person p2=new Person(101,"Rajesh",'M',25000.2);
		 Person p3=new Person(201,"Raju",'M',320.2);
		 Person p4=new Person(401,"Madhu",'M',25000.2);
		 Person p5=new Person(301,"Lakshmi",'F',4500.2);
		 Person p6=new Person(202,"Sree",'F',3500.2);
		 Person p7=new Person(402,"Darani",'M',65000.2);
		 
		
		return Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		
	}

}
