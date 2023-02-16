package com.c2lbiz.basicprograms;

public class PalindromTest {

	public static void main(String[] args) {
		String s = "121";
		int start = 0;
		int end = s.length() - 1;
		boolean ispalindrram = true;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				ispalindrram = false;
				break;
			}
			start++;
			end--;
		}
		if (ispalindrram) {
			System.out.println("is palindrom");
		} else
			System.out.println("not palindrom");
	}

}
