package com.createiq;

import java.util.function.Consumer;
import java.util.function.Function;

public class SamLambda {

	public static void main(String[] args) {
		// SqmDemo functional interface method

		SamDemo sam = (String name) -> {
			System.out.println("wellcome to hyd:--" + name);
		};
		// welcome functional interface method and not need braces, parentheses,return.
		// method name.
		Welcome w = name -> name;// 1
		Function<String, String> lowToUpr = (str) -> str.toUpperCase();// 2
		Function<String, Integer> findCount = fc -> fc.length();// 3
		Consumer<String> consumer = str -> System.out.println(str);// 4.void return type

		System.out.println(w.Hello("Darani"));// 1
		sam.sayHello("Ramu");
		System.out.println(lowToUpr.apply("India"));// 2
		System.out.println(findCount.apply("9963063892"));// 3
		consumer.accept("B.tech");

	}

}
