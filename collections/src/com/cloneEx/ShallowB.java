package com.cloneEx;

public class ShallowB implements Cloneable{
	
	int id;
	ShallowA obj;

	public ShallowB(int id, ShallowA obj) {
		super();
		this.id = id;
		this.obj = obj;
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public ShallowA getObj() {
		return obj;
	}


	public void setObj(ShallowA obj) {
		this.obj = obj;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
	

}
