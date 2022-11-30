package com.overloading;

public class Demo1 {
	public Integer save(Integer a, Integer b) {
		// a+b not possible b/c object in 1.4 jre but 1.5 it allow because boxing
		int x = a.intValue(); // converting object into Primitives (Unboxing)
		int z = b.intValue();// wrapper to primatives// from 1.5 compiler internally write same like
								// z.intValue()
		Integer c = Integer.valueOf(x + z);// converting int to Integer (AutoBoxing)
		return c;

	}
//
//	public int save(int a ,int b) {
//		return a+b;
//
//	}

	// different return types but argument not same
	public Integer save(Integer A) {

		return A;
	}

//	public void save(long a) {
//		System.out.println("it not return long type parameter");
//	}
//
//	// different number of arguments
//	public int save(int a, int b) {
//		return a + b;
//
//	}
//
//	// Different type of arguments and type casting
//	public int save(long a, long b) {
//		return (int) (a + b);
//
//	}
//
//	public long sum(int a, int b) {
//		return a + b;
//
//	}
//
	public static void main(String[] args) {

	Integer a=new Integer(12);
	Integer b=new Integer(40);
	Demo1 d=new Demo1();
	System.out.println(d.save(a,b));
	}

}
