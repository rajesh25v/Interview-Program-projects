package com.map;

import java.util.WeakHashMap;

public class WeakHashMapTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		WeakHashMap w1=new WeakHashMap<>();
		
		DemoAll d1=new DemoAll();
		
		w1.put(d1, "Hai");
		System.out.println(w1);
		d1=null;
		
		System.gc();  //garbage collector removing unreferenced objects
		Thread.sleep(2000);
		System.out.println(w1);
		
	}

}
