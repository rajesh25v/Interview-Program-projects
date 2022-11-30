package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapex {
	
	public static void main(String[] args) {
		
		List<String> fruits=Arrays.asList("Mango","Apple","leamon","Orange","Grap");
		
		List<Integer> fr=fruits.stream().map(String::length).collect(Collectors.toList());
		 System.out.println("fruits length:  "+fr);
	}

}
