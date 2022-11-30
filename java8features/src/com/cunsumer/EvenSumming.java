package com.cunsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class EvenSumming {
	
	public static void main(String[] args) {
		
		//summing even numbers without using stream sum()method
		
		List<Integer> integers = Arrays.asList(13,14,20,31,25,26,28,2);
		
		Integer sum = integers.stream().filter(n -> n % 2 == 0)
		  .collect(Collectors.summingInt(Integer::intValue));
		
		System.out.println("sum of even number without using sum() :"+sum);
		
		System.out.println("even number in List:-- ");
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	     numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	     
	     
	     int arr[] = {12,1,2,4,6};
	     
	     System.out.println("sum of numbers sum() :"+Arrays.stream(arr).sum());
	     
	   
	}
}
