package com.c2lbiz.basicprograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {

	public static void main(String[] args) {

		String ch = "HelloH";
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char[] charry = ch.toCharArray();

		for (char c : charry) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				int value = map.get(c);
				map.put(c, value + 1);
			}
		}
		System.out.println(map);
	}
}
