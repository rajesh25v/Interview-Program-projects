package com.DuplicateRemove;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) {
		List<String> cityList=new ArrayList<>();
		cityList.add("mumbai");
		cityList.add("delhi");
		cityList.add("delhi");
		cityList.add("hyderabad");
		cityList.add("kolkatta");
		cityList.add("amaravathi");
		
		List<String> newList=new ArrayList<>();
		for(String name:cityList) {
			if(!newList.contains(name)) {
				newList.add(name);
			}
		}
		
		for(String name:newList) {
			System.out.println("cityNames:--"+name);
		}
	}

}
