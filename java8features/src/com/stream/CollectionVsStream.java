package com.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.employeeTest.Employee;

public class CollectionVsStream {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("Rajesh");
		names.add("Babu");
		names.add("Darani");
		names.add("Ram");

		for (String n : names) {
			System.out.println("names1:  " + n);// it uses many times
			// System.out.println("names2: "+n);

		}

		Stream<String> stream = names.stream();
		stream.forEach(c -> System.out.println("names by stream1:  " + c));
		// stream.forEach(c->System.out.println("names by stream2: "+c)); it use only
		// once

//		List<String> personList=names.stream().collect(Collectors.toList());
//		System.out.println(personList);
//		
		List<String> personList = names.stream().peek(per -> System.out.println(per)).peek(System.out::println)
				.collect(Collectors.toList());// print any one ways

	}

}
