package com.c2lbiz.basicprograms;

public class ReverseEachWord {

	public static void main(String[] args) {

		String s = "java code";
		String output = "";
		String[] words = s.split(" ");

		for (String word : words) {
			String revword = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				revword = revword + word.charAt(i);
			}
			output = output + revword + " ";
		}
		System.out.println(output);
	}
}
