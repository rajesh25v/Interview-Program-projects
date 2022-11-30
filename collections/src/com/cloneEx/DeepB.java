package com.cloneEx;

public class DeepB implements Cloneable{
	
	int fees;
	DeepA deepA;
	
	public DeepB(int i, DeepA deepA) {
		
		this.fees = i;
		this.deepA = deepA;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public DeepA getDeepA() {
		return deepA;
	}

	public void setDeepA(DeepA deepA) {
		this.deepA = deepA;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		  DeepB obj =(DeepB) super.clone();
		   
		   obj.deepA=(DeepA) deepA.clone();
		   return obj;
	}
	
	
	
		

}
