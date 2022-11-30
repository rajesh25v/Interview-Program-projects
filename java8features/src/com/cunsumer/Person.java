package com.cunsumer;

import java.util.Arrays;
import java.util.List;

public class Person {
	
	int id;
	String name;
	char gender;
	
	
	public Person(int id, String name, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	public static List<Person> getAll(){
		Person p1=new Person(101,"Rajesh",'M');
		Person p2=new Person(102,"Darani",'M');
		Person p3=new Person(200,"Radha",'F');
		return Arrays.asList(p1,p2,p3);
		
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + "]";
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

}
