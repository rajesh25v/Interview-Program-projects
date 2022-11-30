package com.overloading;

public class JavaTpoint {
//customized wrapper class
	private int i;

	public JavaTpoint() {
	}

	public JavaTpoint(int i) {
	}

	public int getValue() {
		return i;
	}

	public void setValue(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return Integer.toString(i);

	}
	// Testing the custom wrapper class

	public static void main(String[] args) {

		JavaTpoint j = new JavaTpoint(10);
		System.out.println(j);//conveting object to primitiveze

	}

}
