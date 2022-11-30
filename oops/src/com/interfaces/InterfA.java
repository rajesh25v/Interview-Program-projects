package com.interfaces;

public interface InterfA {
	
	public final int a=10;
	
	public void save();
	public int delete();
	
	
	private static String m1() {
		
		System.out.println("java JSE 1.9 onwards private also allowed");
		return null;
		
	}
	default void add() {
		
		System.out.println("java 1.7 onward allowed");
	}
	
	public static void sum() {
		System.out.println("java 1.8 onwards");
	}
	
public static void main(String[] args) {
	sum();
	
}
}
