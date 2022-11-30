package com.predicate;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Employee {
	
	String name;
	double Salary;
	public Employee(String name,double salary) {
		
		this.name = name;
		this.Salary=salary;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Employee> l=new ArrayList<>();
		populate(l);
		
		BiConsumer<Employee,Double> c=(e,d)->e.Salary=e.Salary+d;
		
		for(Employee e:l) {
			c.accept(e, 1500.2);
		}
		for(Employee e:l) {
			System.out.println("ename: "+e.name);
			System.out.println("salary :"+e.Salary);
		}		
	}
	
	public static void populate(ArrayList<Employee> e) {
		
		e.add(new Employee("Rajesh", 2502.2));
		e.add(new Employee("Ramu",4520.2));	
	}
}
