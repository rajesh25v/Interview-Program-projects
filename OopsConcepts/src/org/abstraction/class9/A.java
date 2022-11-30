package org.abstraction.class9;

public abstract class A {
	
	public static int a=600;
	public int b;
	
	
	public A() {
		
	}
	
	public static void parent() {
		System.out.println("it access with class name directly");
		
	}
	public  final void parent3() {
	
		
		System.out.println("final method can not override");
		System.out.println(a+b);
		
	}
	public abstract  int par() ;
	
	
	public abstract void child();
	
	protected  abstract void child1();
	
	abstract void child2();
	
}
