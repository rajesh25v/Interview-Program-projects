package com.lambdaExpression;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
	
//	()->System.out.println("lambda expression:-1.nameless.2.no return type.3.no modifier");
//s(int a,int b)->System.out.println(a+b);
	
	public static int square(int a) {
		
		return a*a;
	}
	
	public static void main(String[] args) {
		
		Function<Integer,Integer> f=i->i*i;
		System.out.println(f.apply(12));
		
		Predicate<Integer> p=i-> i%2==0;//it returns true or false only.
		System.out.println(p.test(2));
		
		System.out.println(square(10));
	
	}
	
	public void m1() {
		System.out.println("lambda expression:-1.nameless.2.no return type.3.no modifier");
	}

}
