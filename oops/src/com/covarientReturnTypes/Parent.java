package com.covarientReturnTypes;

public class Parent {

	public Number demo(float a, float b) {

		Number result = a + b;
		return result;
	}

	public Parent sum() {
		return null;

	}
	public static int save(int a) {
		System.out.println("parent class");
		return a;
	}

	public static void m1() {
		System.out.println("parent class");
	}
	public void m2() {
		System.out.println("parent class m2");
	}
}
