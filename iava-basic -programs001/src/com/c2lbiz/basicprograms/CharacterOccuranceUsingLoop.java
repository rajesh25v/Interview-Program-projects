package com.c2lbiz.basicprograms;

public class CharacterOccuranceUsingLoop {

	public static void main(String[] args) {
		String s1 = "I am a developer";

		int[] freq = new int[s1.length()];
		char[] st = s1.toCharArray();

		for (int i = 0; i < s1.length(); i++) {
			freq[i] = 1;
			for (int j = i + 1; j < s1.length(); j++) {
				if (st[i] == st[j]) {
					freq[i]++;
					st[j] = '0';
				}
			}
		}
		for (int i = 0; i < st.length; i++) {
			if (st[i] != '0' && st[i] != ' ') {
				if (freq[i] >= 1) {
					System.out.print(st[i] + "=" + freq[i]+";  ");
				}
			}
		}
	}
}
