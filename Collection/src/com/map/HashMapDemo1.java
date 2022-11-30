package com.map;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) throws InterruptedException {

		HashMap m1 = new HashMap<>();

		DemoAll d1 = new DemoAll();
		m1.put(d1, "Hii");
		System.out.println(m1);
		
		d1 = null;
		System.gc(); //garbage collector not cleaning the un referenced objects
		
		Thread.sleep(2000);
		System.out.println(m1);
	}

}
