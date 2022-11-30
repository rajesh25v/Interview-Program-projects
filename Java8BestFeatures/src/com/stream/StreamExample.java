package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	int id;
	double price;

	public StreamExample(int id, double price) {
		super();
		this.id = id;
		this.price = price;
	}

	public static void main(String[] args) {

		Stream.iterate(1, e -> e + 2).filter(e -> e % 5 == 0).limit(5).forEach(System.out::println);

		List<StreamExample> li = new ArrayList<>();
		li.add(new StreamExample(11, 2500.2));
		li.add(new StreamExample(12, 4500.2));
		li.add(new StreamExample(10, 1200.2));

		//using reduce method summing all products
		Double totalprice = li.stream().map(StreamExample -> StreamExample.price).reduce(0.0,
				(sum, price) -> sum + price);
		//short way summing
		Double total2=li.stream().map(StreamExample->StreamExample.price).reduce(0.0,Double::sum);
		
		
		System.out.println(totalprice);
		System.out.println(total2);

	}

}
