package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindinggreaterTest {

	//without using stream Api
	public static void main(String[] args) {
		
		List<Product> prList=new ArrayList<>();
		prList.add(new Product(101, "Laptop Hp",45000.12));
		prList.add(new Product(102,"Mobile",15000.12));
		prList.add(new Product(200,"Coller",25000.1));
		prList.add(new Product(201,"Laptop Dell",67000.45));
		
		List<Double> prPrice=new ArrayList<>();
		
		for(Product p:prList) {
			if(p.price<35000.0f) {
				prPrice.add(p.price);
			}
		}
		System.out.println(prPrice);
		//using stream APi
		
		List<Double> pricess=prList.stream().filter(p->p.price>25000)
				.map(p->p.price).collect(Collectors.toList());
		System.out.println(pricess);
	}
}
