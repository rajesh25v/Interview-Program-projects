package com.stream;

import java.beans.Customizer;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Customer {
	//method reference
	int id;
	String name;
	double price;
	public Customer(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public static void main(String[] args) {
		
		List<Customer> list=new ArrayList<>();
		list.add(new Customer(500,"Rajesh",4500.2));
		list.add(new Customer(501,"Ravi",3600.2));
		list.add(new Customer(503,"Dana",12000.2));
		list.add(new Customer(504,"Sayad",130.22));
		
		List<Double> l=list.stream().filter(p->p.price>1200).map(Customer::getPrice).collect(Collectors.toList());
		
		System.out.println(l);
		
	}

}
