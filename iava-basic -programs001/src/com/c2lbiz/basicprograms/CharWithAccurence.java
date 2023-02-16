package com.c2lbiz.basicprograms;

import java.util.Arrays;

public class CharWithAccurence {

	public static void main(String[] args) {

		String input = "opentext";
		char charToReplace = 't';
		if (input.indexOf(charToReplace) == -1) {
			System.out.println("Given character not available in input string ");
			System.exit(0);
		}
		char[] arr = input.toCharArray();
		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == charToReplace) {
				arr[i] = String.valueOf(count).charAt(0);
				count++;

			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
