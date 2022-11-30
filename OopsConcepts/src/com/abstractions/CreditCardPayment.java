package com.abstractions;

public class CreditCardPayment implements Ipayment{

	@Override
	public void doPayment(double amount) {
		System.out.println("credit card payment :-"+amount);
		
	}

}
