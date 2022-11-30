package com.abstractions;

public class CashPayment implements Ipayment{

	@Override
	public void doPayment(double amount) {
		System.out.println("cash payment amount:-"+amount);
		
	}

}
