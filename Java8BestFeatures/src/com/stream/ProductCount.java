package com.stream;

import java.util.ArrayList;
import java.util.List;

public class ProductCount {
	
	int id;
	float price;
	public ProductCount(int id, double d) {
		super();
		this.id = id;
		this.price = (float) d;
	}
	
	public static void main(String[] args) {
		
		List<ProductCount> li=new ArrayList<>();
	
		li.add(new ProductCount(1,2500.4));
		li.add(new ProductCount(2,4500.12));
		li.add(new ProductCount(5,6500.2));
		li.add(new ProductCount(5,120.2));
		
		int total=(int) li.stream().filter(p->p.price<3000).count();
		
		System.out.println(total);
	}

}
