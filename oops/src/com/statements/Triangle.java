package com.statements;

public class Triangle {

	public static void main(String[] args) {

		int rows = 5, space;

		for (int i = 1; i <= rows; i++) {
			for (space = 1; space <= (rows - i); space++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {//*2 romove get left triangle
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("Triangle down");

		for (int i = rows; i >=1; i--) {
			for (space = 1; space <= (rows - i); space++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i *2 - 1; j++) {//*2 romove get left right triangle
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
