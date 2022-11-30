package com.exception.tryWithResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WithResource {
	
	public static void main(String[] args) {
		
		try(BufferedReader br=new BufferedReader(new FileReader("D:\\testout.txt"))) {
			String strLine;
			while((strLine= br.readLine())!=null) {
				System.out.println("line is "+strLine);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
