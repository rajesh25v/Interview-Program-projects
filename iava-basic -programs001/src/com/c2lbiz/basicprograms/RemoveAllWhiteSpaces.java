package com.c2lbiz.basicprograms;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		String str="J a v a d e v e l o p e r ";
		String str2=str.replaceAll("\\s","");
		System.out.println(str2);
	}
}
