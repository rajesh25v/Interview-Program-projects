package org.patterns;

public class Diamond {

	public static void main(String[] args) {

		int n = 6;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 2 * (i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int sapce = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sapce; j++) {
				System.out.print(" ");
			}
			sapce++;
			for (int j = 1; j <=2*( n - i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}