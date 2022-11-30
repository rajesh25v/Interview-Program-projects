package com.reference;

public class StudentImpl implements Interf{

	@Override
	public Student fget(String name, int id, double fees) {
		
		Student s=new Student(id, name, fees);
		return s;
	}

	
	public static void main(String[] args) {
		
		Interf i=(name,id,fees)->new Student(101,"Rajesh",452.20);
	System.out.println("hello");	
	}
}
