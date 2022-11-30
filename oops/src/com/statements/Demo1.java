package com.statements;

public class Demo1 {

	public static void main(String[] args) {

		// 1. Right triangle
		System.out.println("1. Right Triangle:--");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("2. 4th right triangle");

		for (int i = 5; i >= 1; --i) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		 
		System.out.println("Ex:----2. right triangl");
		int items=4;
		for(int i=0;i<=items;i++) {
			for(int j=items;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
