package com.cloneEx;

public class Test implements Cloneable{
	int id;
	String name;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		
		
		return super.clone();
	}
	public static void main(String[] args) {
		Test t1=new Test();
		t1.id=200;
		t1.name="Rajersh";
		Test t2 = null;
		try {
			t2=(Test) t1.clone();
		} catch (CloneNotSupportedException e) {
	
			e.printStackTrace();
		}
	System.out.println(t1.id+"  "+t1.name);
	System.out.println(t2.id+" "+t2.name);
		
	}
	
	
	
	

}
