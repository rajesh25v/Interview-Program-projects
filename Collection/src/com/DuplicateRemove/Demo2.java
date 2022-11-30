package com.DuplicateRemove;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Demo2 {
	public static void main(String[] args) {
		List<String> cities=new ArrayList<>();
		cities.add("mumbai");
		cities.add("delhi");
		cities.add("delhi");
		cities.add("kolkatta");
		cities.add("amaravathi");
		
//		//insertion order not possiple to get
//		HashSet<String> hset=new HashSet<>(cities);
//		cities.clear();
//		cities.addAll(hset);
//		
//		for(String name:cities) {
//			System.out.println("city list:--"+name);
//		}
		
		//insertion order possible to get
		
		Set<String> lhset=new LinkedHashSet<>(cities);
		cities.clear();
		cities.addAll(lhset);
		
		for(String name:cities) {
			System.out.println(name);
		}
	}

}
