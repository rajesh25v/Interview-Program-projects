package com.predicate;

import java.util.function.Predicate;

public class EvenCheck {
	
	public static void main(String[] args) {
		
		int[] n= {2,5,4,6,10,20,21,31,30};
		
		Predicate<Integer> p1=i->i%2==0;
		Predicate<Integer> p2=i->i>5;
		//p1.or(p2).test(x1)
		
		System.out.println("even numbers:---");
		for(int x1:n) {
			if(p1.and(p2).test(x1)) {
				System.out.println(x1);
			}
		}
		System.out.println("not even numbers:--");
		for(int x1:n) {
			if(p1.negate().test(x1)) {
				System.out.println(x1);
			}
		}
	}

}
