package com.stream;

import java.util.ArrayList;
import java.util.List;

public class FindingMaxAndMinTest {
	
	public static void main(String[] args) {
		  List<Product> productsList = new ArrayList<Product>();    
	        //Adding Products    
	        productsList.add(new Product(1,"HP Laptop",25000f));    
	        productsList.add(new Product(2,"Dell Laptop",30000f));    
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));    
	        productsList.add(new Product(4,"Sony Laptop",28000f));    
	        productsList.add(new Product(5,"Apple Laptop",90000f));    
	        //finding maximum price
	        Product productA=productsList.stream()
	       .max((product1,product2)->product1.price>product2.price ?1:-1).get();
	       
	        System.out.println("maximum price:--"+productA.price);
	        //finding min price
	        Product productB=productsList.stream()
	       .min((product1,product2)->product1.price>product2.price?1:-1).get();
	        
	        System.out.println("minimum price:-"+productB.price);
	        
	        
	        //count method:--
	        long count=productsList.stream().filter(p->p.price<45000).count();
	        
	        System.out.println("counted products:"+count);
	}

}
