package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class murali {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(a);
		List<Integer> z = new ArrayList<>();
		System.out.println("even numbers:---");

		for (Integer b : a) {
			if (b % 2 != 0) {
				z.add(b);
			}
		}
		for (Integer b : a) {
			if (b % 2 == 0) {
				z.add(b);
			}
		}
		
		System.out.println(z);
	}
}
