package com.createiq.bean;

public class Palindrom1{
	
	public boolean isPalindrom(String str) {
		String reverse = "Rajesh";
		int length = str.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);

		}
		if (str.equals(reverse)) {
			return true;
		} else {
			return false;
		}
	}

}
