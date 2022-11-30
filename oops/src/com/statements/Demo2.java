package com.statements;

public class Demo2 {

	public static void main(String[] args) {
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j >= i; j--) {
				System.out.print(j);

			}
			System.out.println();
		}
	
		for (int i = 1; i <= rows; i++) {
			for (int j = i; j <= rows; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("4");
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
