package com.list;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> s1=new ArrayList<>();
		s1.add("Rajesh");
		s1.add("Ravi");
		s1.add("Sai");
		s1.add("Praveen");
		//s1.add(null);
		//s1.add(null);
		
		Collections.sort(s1);//sort() method not trying sort null values throw null pointer exception
		System.out.println(s1);
		
	LinkedList<String> s2=new LinkedList<>();
	s2.add("Madhu");
	s2.add("Ramu");
	s2.add("Darani");
	s2.add(null);
	s2.add(null);
	s2.push("David");//add element
	System.out.println(s2);
	s2.pop();//remove top element
	s2.pollLast();//remove last element
	s2.poll();//remove first element
	
	
	System.out.println(s2);
	s2.removeLast();
	s2.offerFirst("Hari");
	s2.offerLast("Zavid");
	System.out.println("linked list:------------");
	System.out.println(s2);
	System.out.println("First element:--"+s2.getFirst());
	System.out.println("last element:--"+s2.getLast());
	System.out.println("top element:--"+s2.peek());
	
	
	Vector<Integer> s3=new Vector<>();
	s3.add(5);
	s3.add(3);
	s3.add(0,10);
	s3.add(null);
	s3.add(4);
	s3.add(0,3);
	 System.out.println(s3);
	 
	 CopyOnWriteArrayList<String> cp=new CopyOnWriteArrayList<>();
	 cp.add("Ravi");
	 cp.add("anil");
	 cp.add(null);
	 cp.add("David");
	 
	 System.out.println(cp);
	 
	 Iterator<String> itr=s2.iterator();
	 
	 while (itr.hasNext()) {
		System.out.println(itr.next());
		s2.add("Ramu");
		
	}
	 
// Iterator<String> itr=cp.iterator();
//	 
//	 while (itr.hasNext()) {
//		System.out.println(itr.next());
//		cp.add("Venu");
//	 }
//	 System.out.println(cp);
	}
}
