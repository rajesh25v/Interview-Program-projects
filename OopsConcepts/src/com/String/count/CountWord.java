package com.String.count;

public class CountWord {

	public static int countword(String str) {

		int c = 0;
		char[] ch = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			System.out.println(str.charAt(i));
			if (((i > 0) && (ch[i] != ' ' && ch[i] != '\t') && (ch[i - 1] == ' ' || ch[i - 1] == '\t'))
					|| ((ch[0] != ' ' && ch[0] != '\t') && (i == 0)))
				c++;

		}
		return c;

	}

	private static int countWordsUsingSplit(String str) {

		String[] test = str.trim().split("\\s+");
		return test.length;
	}

	public static void main(String[] args) {

		System.out.println("count words:--" + countword(" Hello rajesh  a"));
		System.out.println("count words using split:--" + countWordsUsingSplit("v Rajesh a"));
	}

}
