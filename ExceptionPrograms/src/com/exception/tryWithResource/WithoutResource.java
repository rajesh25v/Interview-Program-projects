package com.exception.tryWithResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WithoutResource {
	
	public static void main(String[] args) {
		
		BufferedReader br=null;
		try {
			br=new BufferedReader(new FileReader("D:\\testout.txt"));
			System.out.println(br.readLine());
		}catch (IOException e) {
		e.printStackTrace();
		}finally {
			try {
			if(br!=null) {
				System.out.println("file closed successfully");
					br.close();
			}
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
	

}
