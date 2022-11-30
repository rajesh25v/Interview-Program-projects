package com.cloneEx;

public class DeepTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		DeepB d1=new DeepB(2500,new DeepA(1001,"Rajesh"));
		
		DeepB t=(DeepB) d1.clone();
		
		t.getDeepA().setId(1);
		System.out.println(d1.fees+" "+d1.deepA.id+" "+d1.deepA.name);
		System.out.println(t.fees+" "+t.deepA.id+" "+t.deepA.name);
		
	}

}
