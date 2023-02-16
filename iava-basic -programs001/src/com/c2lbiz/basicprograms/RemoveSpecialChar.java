package com.c2lbiz.basicprograms;

/**
 *
 * @author Vadla
 */
public class RemoveSpecialChar {
			
	public static void main(String[] args) {

		// Removing special characters
		String str = " !j@ava$ devel*per%";
		String plainStr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainStr);

//		 Removing spaces in words

		String str2 = "Software  Developer";
		String plainStr2 = str2.replaceAll(" ", "");

		System.out.println(plainStr2);
	}
}
