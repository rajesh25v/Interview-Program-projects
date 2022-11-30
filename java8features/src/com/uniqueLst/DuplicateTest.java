package com.uniqueLst;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.print.DocFlavor.INPUT_STREAM;

public class DuplicateTest {
	
	 public static void main(String[] args) {
		
		 List<Integer> numbers=List.of(2,1,2,3,4,1);
			 
		 System.out.println("finding distinct number in list: ");
		 numbers.stream().distinct().forEach(System.out::println);
		 
		 Set<Integer> numberSet=new HashSet<>(numbers);
		 System.out.println("hash java5 :"+numberSet);
		 
		Set<Integer>numset= Stream.of(10,20,10,30).collect(Collectors.toCollection(HashSet::new));
		System.out.println("java8 hashset :"+numset);
	}

}
