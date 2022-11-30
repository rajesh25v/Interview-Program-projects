package org.abstraction.class9;

public class B extends A{
	
	  int z;


		@Override
		public int par() {
			System.out.println(" normal override method");
			return z;
		}
	  
	@Override
	public void child() {
		System.out.println("in this class all abstract methods implemented mandatory");
		
	}

	@Override
	protected void child1() {

		
	}
	@Override
	void child2() {
		
		
	}
	
	public static void main(String[] args) {
		B obj=new B();
		A.parent();  ///static method access with class name
		obj.b=100;
		obj.a=200;
		obj.z=300;
		obj.par();
		System.out.println(obj.par());// here using print method
		obj.parent3();  //it not return any value so it can not work  println method
		
		A a=new B(); //parent class reference child class object
		a.a=1;
		a.b=2;
	a.parent3();

		
	}


	
}
