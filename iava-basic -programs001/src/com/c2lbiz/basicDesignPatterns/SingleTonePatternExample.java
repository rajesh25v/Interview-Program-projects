package com.c2lbiz.basicDesignPatterns;

public class SingleTonePatternExample {
	//Class Loader
	static SingleTonePatternExample s1=new SingleTonePatternExample();//EAGER INITIALIZATION
	
	static SingleTonePatternExample s2=null;//LAZY INITIALIZATION
	
	private SingleTonePatternExample() {

	}
	
	public static SingleTonePatternExample getInstance() {
		if(s2==null) {
			return s2=new SingleTonePatternExample();
			
		}
		return s2;
		
	}
}
