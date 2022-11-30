package com.hashmap;

import java.util.HashMap;

public class StudentTest {
	
	public static void main(String[] args) {
		
		HashMap<Student,String> h=new HashMap<>();
		Student s1=new Student(101,"Rajesh");
		Student s2=new Student(101,"Rajesh");
		h.put(s1, "R");
		s1.setName("Ravi");
		h.put(s2, "K");
		
		
		System.out.println(s1);
		System.out.println(h);
		
	}

}
