package com.cunsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EvenSummingTest {

	static List<Integer> list = Arrays.asList(120, 121, 2, 3, 2, 1);

	//static Predicate<Integer> p1 = per -> per % 2 == 0;

	static List<Integer> sum=list.stream().filter(n->n%2==0).collect(Collectors.toList());
	//.filter(p1)
	
	public static void main(String[] args) {
		Integer list = 0;
		for (Integer l : sum) {
			list += l;
		}
		System.out.println(list);
	}
}
