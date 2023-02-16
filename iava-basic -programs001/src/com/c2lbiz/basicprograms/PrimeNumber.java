package com.c2lbiz.basicprograms;

public class PrimeNumber {
	public static void main(String[] args) {

		String primerNum = " ";
		for (int i = 1; i <= 100; i++) {
			int counter = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primerNum = primerNum + i + " ";
			}
		}
		System.out.println("primernumer");
		System.out.println(primerNum);

	}
}
