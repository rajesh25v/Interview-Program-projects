package com.ioverriding;

import java.util.ArrayList;
import java.util.List;

public class Child extends Parent{

	@Override
	public void add() {
	
		super.add();
	}

	@Override
	protected Child top() {
		
		
		return null;
	}

	@Override
	public Integer big() {
		
		return super.big();
	}
	public static void main(String[] args) {
		List<Integer> e=new ArrayList<Integer>();
	}

}
