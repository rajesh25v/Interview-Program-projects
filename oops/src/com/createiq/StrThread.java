package com.createiq;

public class StrThread implements Runnable{

	private String s;

	public StrThread(String s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		System.out.println("in run method " + Thread.currentThread().getName());

		try {
			// introducing some delay
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Adding to String
		s = s + Thread.currentThread().getName();
		System.out.println("String " + s);	
	}
	
	public static void main(String[] args) throws InterruptedException {
		String str = "abc";
		// Three threadss
		Thread t1 = new Thread(new StrThread(str));
		Thread t2 = new Thread(new StrThread(str));
		Thread t3 = new Thread(new StrThread(str));
		t1.start();
		t2.start();
		t3.start();
		// Waiting for all of them to finish
	
			t1.join();
			t2.join();
			t3.join();
		
		System.out.println("String is " + str.toString());
	
	}
	
}
