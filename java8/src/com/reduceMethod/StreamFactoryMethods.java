package com.reduceMethod;

import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFactoryMethods {
	
	
	static UnaryOperator<Integer> add=x->x+5;
	public static void main(String[] args) {
		
		Stream<Integer> s1=Stream.iterate(0,add).limit(10);
		s1.forEach(System.out::println);
		
		
		
		IntStream in=IntStream.rangeClosed(1, 6);
		IntStream in2=IntStream.range(1, 6);
		System.out.println(in);
		in.forEach(System.out::println);
		System.out.println("range()f methods :------");
		in2.forEach(System.out::println);
		
		
	}

}
