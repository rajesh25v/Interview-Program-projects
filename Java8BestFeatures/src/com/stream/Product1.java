package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product1 {

	int id;
	String name;
	double price;

	public Product1(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {

		List<Product> l = new ArrayList<>();
		l.add(new Product(200, "Mobile", 12000.25));
		l.add(new Product(200, "HairPhone", 1300.25));
		l.add(new Product(200, "Watch", 800.25));
		l.add(new Product(200, "Laptop", 56000.25));
		l.add(new Product(200, "Tab", 12000.25));

		l.stream().filter(p -> p.price >= 15000.2).forEach(p -> System.out.println(p.name));

		List<Double> prod1=l.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
		// finding total
		double totalPrice = l.stream().map(p -> p.price).reduce(0.0, (sum, price) -> sum + price);
		// finding sum another way
		Double totalsum = l.stream().map(P -> P.price).reduce(0.0d, Double::sum);

		System.out.println("total prices:-" + totalPrice);
		System.out.println(totalsum);
		
		System.out.println("finding ptrice above 30000 and as list "+prod1);

	}

}
