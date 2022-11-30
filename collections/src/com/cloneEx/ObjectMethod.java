package com.cloneEx;

public class ObjectMethod implements Cloneable{
	
	int id;
	String name;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		ObjectMethod ob1=new ObjectMethod();
		ob1.id=100;
		ob1.name="Rajesh";
		ObjectMethod t1=(ObjectMethod) ob1.clone();
		System.out.println(ob1.id+"  "+ob1.name);
		System.out.println(t1.id+"  "+t1.name);
		
		if(ob1!=t1) {
			System.out.println("different instances");
		}else {
			System.out.println("same instances");
		}
		
	}

}
