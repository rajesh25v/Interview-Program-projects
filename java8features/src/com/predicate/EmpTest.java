package com.predicate;

import java.util.ArrayList;

import java.util.function.Predicate;

public class EmpTest {
	 public static void main(String[] args) {
		
		 ArrayList<Employee> l=new ArrayList<>();
		 
		 l.add(new Employee("Rajesh",2500.2));
		 l.add(new Employee("Ramu",4500.23));
		 l.add(new Employee("Hari",4560.23));
		 l.add(new Employee("David",15000.2));
		 
		 Predicate<Employee> p=e->e.Salary>4500.23;
		 
		 for(Employee e1:l) {
			 //p.salary(e1) or p.test(e1)
			 if(p.test(e1)) {
				 System.out.println("  "+e1.name+": "+e1.Salary);
			 }
		 }
	}

}
