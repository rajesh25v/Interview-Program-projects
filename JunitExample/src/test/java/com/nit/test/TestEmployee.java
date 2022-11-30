package com.nit.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@DisplayName(" Testing Employyee Task")
@TestMethodOrder(OrderAnnotation.class)
public class TestEmployee {

	
	@BeforeAll
	public static void oneAll() {
		System.out.println("setup once time");
	}
	@BeforeEach
	public void setUp() {
		//setup,int data
		System.out.println("setup");
	}
	@Test
	@Order(2)
	@DisplayName("Testing  Save Mehtod")
	public void testSave() {
		System.out.println("Hello");
	}
	@Test
	@Order(1)
	public void testUpdate() {
		System.out.println("Hello update");
	}
	@Test
	@Order(3)
	public void testDelete() {
		System.out.println("Hello delete");
	}
	@AfterEach
	public void clear() {
		System.out.println("clear data");
	}
	
	@AfterAll
	public static void closeAll() {
		 System.out.println("once at end");
	}

}
