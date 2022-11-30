package com.abstractions;

public class Payment {
	
	private static final String cash="CASH";
	private static final String cc="CARD";
	
	public static void main(String[] args) {
	
		Payment p=new Payment();
		p.executePayment(cc, 25000);
		
	}
	public void executePayment(String mode,double amount) {
		
		Ipayment ref;
		if(mode.equalsIgnoreCase("cash")) {
			ref=new CashPayment();
			ref.doPayment(amount);
			
		}else if(mode.equalsIgnoreCase("Card")) {
			ref=new CreditCardPayment();
			ref.doPayment(amount);
		}
		
	}

}
