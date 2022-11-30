package com.predicate;

import java.util.function.Consumer;

public class Movie {
	String name;
	
	public Movie(String name) {
		this.name=name;
	}
	
	public static void main(String[] args) {
		
		Consumer<Movie> c1=m->System.out.println(m.name+"ready to release");
		Consumer<Movie> c2=m->System.out.println(m.name+"released but gigger flop");
		Consumer<Movie> c3=m->System.out.println(m.name+"storing data in form");
		
		Consumer<Movie> cc=c1.andThen(c2).andThen(c3);
		
		Movie m=new Movie("Legend");
		//cc.accept(m);
		c1.accept(m);
	}

}
