package com.reduceMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonRepository {
	
	public static Double sumOfsal() {
		
		return Person.allPerson().stream().collect(Collectors.summingDouble(Person::getSalary));
	}
	
	public static Double avgSal() {
		return Person.allPerson().stream().collect(Collectors.averagingDouble(Person::getSalary));
		
		
	}
	
	public static void GroupByGender() {
		Map<Character, List<Person>> goup=Person.allPerson().stream().collect(Collectors.groupingBy(Person::getGender));
	goup.entrySet().forEach(per->System.out.println("key: "+per.getKey()+"/values :"+per.getValue()));
	//OR use this
	Stream.of(goup).forEach(System.out::println);
	}
	
	public static void main(String[] args) {

	 System.out.println("sum of salaries :"+sumOfsal());
	 System.out.println("average sal : "+avgSal());
	 
	 GroupByGender(); 
	 
	}
	

}
