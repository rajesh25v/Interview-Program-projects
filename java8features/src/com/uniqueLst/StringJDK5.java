package com.uniqueLst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJDK5 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Rajesh", "Ravi", "Madhu", "Rajesh", "Ravi", "11", "11");
		List<String> uniquList = new ArrayList<>();

		for (String nam : names) {
			if (!uniquList.contains(nam)) {
				uniquList.add(nam);
			}
		}
		System.out.println("java normal unique list: " + uniquList);

		List<String> uniqueList2 = names.stream().distinct().collect(Collectors.toList());

		System.out.println(uniqueList2);

	}

}
