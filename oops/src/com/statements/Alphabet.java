package com.statements;

public class Alphabet {

	public static void main(String[] args) {
		int alphabet = 65;//A=65; -=45;
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (alphabet + j - 1) + " ");
			}
			System.out.println();
		}
		System.out.println("secong right triangle");

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (alphabet + i - 1) + " ");
			}
			System.out.println();
		}
		System.out.println("triangle:---");

		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print((char) (alphabet + k - 1) + " ");
			}
			System.out.println();
		}
	}

}
