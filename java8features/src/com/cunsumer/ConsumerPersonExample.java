package com.cunsumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPersonExample {
	
	static Consumer<Person> c1=p->System.out.println(p);
	
	static Consumer<Person> c2=p->System.out.println(p.getName().toUpperCase());
	
	static List<Person> pList=Person.getAll();
	
	static void printCondition() {
		
		pList.forEach(c1.andThen(c2));
	}
	static void printWithCondition1() {
		pList.forEach(p->{
			if(p.getName().equals("Rajesh")&&p.getGender()=='M') {
				System.out.println(" Hello :--"+p);
			}
		});
	}
	static void printWithCondition2() {
		pList.forEach(p->{
			if(p.getName().equals("Rajesh")&&p.getGender()=='M') {
				
				System.out.println(" Upper case :--"+p);
				c1.andThen(c2).accept(p);
			}
		});
	}
	
	public static void main(String[] args) {
		
	//	c1.accept(Person.getAll());
	//	c2.accept( Person.getAll());
		
		printCondition();
		printWithCondition1();
		printWithCondition2();
		
	}

}
