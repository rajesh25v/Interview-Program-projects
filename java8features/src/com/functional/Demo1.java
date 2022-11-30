package com.functional;

import java.util.function.Function;

public class Demo1 {
	
	
	static Function<String,String> f1=name->name.toUpperCase();
	static Function<String,String> f2=name->name.toUpperCase().concat(" welcome");
	static Function<String,String> f3=name->name.trim();
	
	static Function<String,Integer> s1=name->name.length();
	
	 
public static void main(String[] args) {
	
	
	System.out.println(f1.apply("Rajesh"));
	System.out.println(f2.apply("Rajesh"));
	System.out.println(f3.apply("   Harsha  "));
	System.out.println(f1.andThen(f2).apply("Ramu"));
	System.out.println("compose result:  "+f1.compose(f2).apply("Radha"));//f2 first compose and then 1
	
}	

}
