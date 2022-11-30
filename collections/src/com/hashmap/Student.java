package com.hashmap;

import java.util.Objects;

public final class Student {
	final int id;
	String name;
	public int getId() {
		return id;
	}
	
public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

//	public void setId(int id) {
//		this.id = id;//final varible not possible to change
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	

}
