package com.c2lbiz.basicprograms;

import java.util.Arrays;

public class SortStringChar {

	public static void main(String[] args) {
		String str = "java";
//Sorting string without using third variable
		char[] arr = str.toCharArray();
		char temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
//Apporach-2
		System.out.println(new String(arr));
		String str1 = "decode";
		char[] charArray = str1.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String(charArray));

	}
}
