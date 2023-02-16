package com.c2lbiz.basicprograms;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Hello";

		// 1.Apporach
		char[] charr = str.toCharArray();
		for (int i = charr.length - 1; i >= 0; i--) {
			System.out.print(charr[i]);
		}
		System.out.println();

		// 2.Approach
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println();

		// 3.Apporach
		StringBuffer sf = new StringBuffer(str);
		System.out.println(sf.reverse());

		String s1 = "Rajesh java Developer";
		char[] arr = s1.toCharArray();

		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.print(s1.charAt(i));
		}
	}
}
