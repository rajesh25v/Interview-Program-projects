package com.c2lbiz.basicDesignPatterns;

public class SingleTonrTest {
	public static void main(String[] args) {

//		SingleTonePatternExample s = new SingleTonePatternExample();
//		System.out.println(s.hashCode());
//
//		SingleTonePatternExample s2 = new SingleTonePatternExample();
//		System.out.println(s2.hashCode());

		System.err.println(SingleTonePatternExample.getInstance().hashCode());
	}

}
