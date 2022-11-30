package com.interfaces;

public interface Demo {
	// variables all public static final;instante variables not allowed
	// java 8
	int a = 100;
	public final int b = 10;

	/*
	 * interface all methods are must be public and abstract only, protected, final
	 * not allowed in anywere.b/c not override, not usefull in this interface b/c no
	 * constructor
	 */
	/*
	 * public abstract void m1();
	 * 
	 * void n();
	 * 
	 * public static void m2() { }
	 * 
	 * default void m3() { }
	 * 
	 * static void m5() {
	 * 
	 * }
	 * 
	 * private static void m4() {
	 * 
	 * } private void n1() { }
	 */
}
