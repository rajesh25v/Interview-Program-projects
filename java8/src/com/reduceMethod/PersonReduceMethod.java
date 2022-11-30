package com.reduceMethod;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PersonReduceMethod {
	static Predicate<Person> p1 = per -> per.getSalary() >= 2500.2;
	static Predicate<Person> p2 = per -> per.getGender() == 'F';

	public static void main(String[] args) {

		Integer kidsCount = Person.allPerson().stream().filter(p2).map(Person::getId).reduce(0, Integer::sum);
		System.out.println(kidsCount);

		System.out.println("limit(), skip() method  :---------");
		List<String> fruits=Arrays.asList("mango","orange","bananna","leamon","apple");
		fruits.stream().limit(2).forEach(System.out::println);
		
		List<Integer> l=Arrays.asList(1,2,3,4,5);
		int sum1=l.stream().limit(2).reduce(0,(x,y)->(x+y));
		System.out.println("sum of numbers :"+sum1);
		
		int sum2=l.stream().skip(2).reduce(0,(x,y)->(x+y));
		System.out.println("sum of numbers :"+sum2);
		
		
	}

}
