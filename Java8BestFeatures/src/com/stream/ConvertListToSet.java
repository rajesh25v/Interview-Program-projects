package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListToSet {

	public static void main(String[] args) {

		List<Product> productsList = new ArrayList<Product>();

		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		// converting list to set
		Set<Double> price = productsList.stream().filter(p -> p.price > 2500).map(p -> p.price)
				.collect(Collectors.toSet());

		System.out.println(price);

		// converting list to map
		Map<Integer, String> map = productsList.stream()
				.collect(Collectors.toMap(p -> p.id, p -> p.name));
		System.out.println(map);
		
	}

}
