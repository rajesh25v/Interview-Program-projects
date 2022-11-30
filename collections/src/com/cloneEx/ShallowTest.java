package com.cloneEx;

public class ShallowTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		ShallowB b1=new ShallowB(5,new ShallowA(1,2));
		
		
		ShallowB t=(ShallowB) b1.clone();
		
		t.obj.setA(250);//it changes original clone object
		System.out.println(b1.getId()+" "+b1.getObj().getA()+" "+b1.getObj().getB());
		System.out.println(t.getId()+" "+t.getObj().getA()+" "+t.getObj().getB());
		
	}

}
