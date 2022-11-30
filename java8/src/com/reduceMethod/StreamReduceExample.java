package com.reduceMethod;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {

	public static void main(String[] args) {

		List<Integer> listofIntegers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		int sum = listofIntegers.stream().mapToInt(i -> i).sum();
		System.out.println(sum);

		int multiply = listofIntegers.stream().reduce(1, (a, b) -> a * b);
		System.out.println("multiplication of numbers: " + multiply);

	}

}
