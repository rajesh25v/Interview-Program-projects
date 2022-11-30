package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		List<Integer> even = Arrays.asList(2, 4, 6, 8, 10);
		List<Integer> odd = Arrays.asList(1, 3, 6, 7, 90);

		List<List<Integer>> listOfList = Arrays.asList(even, odd);
		System.out.println(listOfList);

		List<Integer> flatlist = listOfList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		
		System.out.println(flatlist);
		
		int a=10;
		System.out.println( a += 10);//a =a+10;

	}

}
