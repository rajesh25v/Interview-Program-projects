package com.c2lbiz.basicprograms;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Rajesh");
		list.add("Hari");
		list.add("14");

		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}
}