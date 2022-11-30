package com.exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class NestedCatch {
	
	public static void main(String[] args) {
		int a=10,b=0;
		try {
			FileInputStream fis=new FileInputStream(new File( args[2]));
			
			try {
				System.out.println(a/b);
			}catch (ArithmeticException e) {
				System.out.println("arithmetic exception in nested catch");
			}
		}catch(ArithmeticException e) {
			System.out.println("arithmetnic exception");
		}catch (FileNotFoundException  e) {
			 System.out.println("file not found");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bound");
		}catch (Exception e) {
			System.out.println("all exp");
		}
	}

}
