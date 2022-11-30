package com.reduceMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PersonTest {

	public static void main(String[] args) {
		
		
		Person p1=new Person(502,"Yamini",'F',46520.2);
		Person p2=new Person(101,"Rajesh",'M',25000.2);
		 Person p3=new Person(201,"Raju",'M',320.2);
		 Person p4=new Person(401,"Madhu",'M',25000.2);
		 Person p5=new Person(301,"Lakshmi",'F',4500.2);
		 Person p6=new Person(202,"Sree",'F',3500.2);
		 Person p7=new Person(402,"Darani",'M',65000.2);
		
		 List<Person> p=Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		
		 System.out.println(p.stream().reduce((x, y) -> x.getSalary() > y.getSalary() ? y : x));
			
		 
		 
		Optional<Person> hieghstsalary = p.stream().reduce((x, y) -> x.getSalary() > y.getSalary() ? y : x);
		Optional<Person> sal=Optional.of(hieghstsalary.get());

		System.out.println("maximum salary  "+sal);
	}

}
