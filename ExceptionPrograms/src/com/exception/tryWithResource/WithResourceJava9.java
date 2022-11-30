package com.exception.tryWithResource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WithResourceJava9 {
	
	public static void readFile(String filePath) throws IOException {
		
		BufferedReader br=new BufferedReader(new FileReader(filePath));
		try (br){
			System.out.println(br.readLine());
		}
	}
	
	public static void main(String[] args) {
		
		try {
			readFile("D:\\testout.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
