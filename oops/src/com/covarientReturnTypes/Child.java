package com.covarientReturnTypes;

public class Child extends Parent {

	@Override
	public Integer demo(float a, float b) {

		return (int) (a + b);
	}

	public Child sum() {

		return null;

	}

	public static void m1() {
		System.out.println("child class");
	}

	@Override
	public void m2() {
		System.out.println("child class m2");
		// super.m2();
	}

	public static void main(String[] args) {

		Parent p = new Parent();
		Child c = new Child();
		Parent p1 = new Child();
		p1.m1();
		p1.m2();

	}

}
