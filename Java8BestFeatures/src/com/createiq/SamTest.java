package com.createiq;

public class SamTest {

	public static void main(String[] args) {
		// inner class
		SamDemo sam = new SamDemo() {

			@Override
			public void sayHello(String name) {
				System.out.println("hello mister:--" + name);

			}

		};

		SamDemo sam1 = new SamDemo() {

			@Override
			public void sayHello(String name) {
				System.out.println("hello misses:--" + name);

			}
		};

		sam1.sayHello("Radha");
		sam.sayHello("Rajesh");
	}

}
