package com.uniqueLst;

import java.util.Comparator;

public class ComparatorLambda {
	
	public static void main(String[] args) {
		//before java8
		Comparator<Integer> c1=new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2);
			}
		};
		System.out.println("comparator 1: "+c1.compare(12, 13));
		
		//java8 lambda expresssion
		Comparator<Integer> c2=(Integer x,Integer y)->x.compareTo(y);
		System.out.println("comparator 2: "+c2.compare(12,12));
		
		Comparator<Integer> c3=(x,y)->x.compareTo(y);
		
		System.out.println("comparator 3: "+c3.compare(4,2));
	}

}
