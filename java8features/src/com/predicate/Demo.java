package com.predicate;

import java.util.function.Predicate;

public class Demo {

	
	public static void main(String[] args) {
		
		String[] s= {"Rajesh","Babu","Ramu","Hari","Karthik","44","45","404"};
		Predicate<String> p=p1->p1.length()%2==0;
		
		for(String p1:s) {
			if(p.test(p1)){
				System.out.println(p1);
			}
		}
	}

}
