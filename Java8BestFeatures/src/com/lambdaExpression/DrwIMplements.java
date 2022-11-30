package com.lambdaExpression;

public class DrwIMplements {
	
	public static void main(String[] args) {
		
		int width=10;
		
		Drawable d1=()->{System.out.println("lambda expression "+width);
		};
		
		Drawable d=new Drawable() {
			
			@Override
			public void draw() {
				System.out.println("drawable "+width);
			}
		};
		d1.draw();
		d.draw();
	}

}
