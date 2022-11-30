package com.employeeTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class MethodReference {
	
	public static int compare(Integer x,Integer y) {
		
		return Integer.compare(x, y);
	}
	
	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		
		
		//normal way 
		System.out.println("result:  "+MethodReference.compare(12, 45));
		//by using method reference
		Comparator<Integer> com=MethodReference::compare;
		System.out.println(com.compare(12,12));
		
	
		Predicate<Employee> p1=per->per.getGender()=="Male";
		Predicate<Employee> p2=per->per.getYearOfJoining()==2015;
		
		Map<String, String> m=employeeList.stream().filter(p1).filter(p2).collect(Collectors.toMap(Employee::getName, Employee::getGender));
		System.out.println(m);
		
		List<String> l=employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
		System.out.println("list of departmnets:  "+l);
		
	}
	
	
	
	

}
