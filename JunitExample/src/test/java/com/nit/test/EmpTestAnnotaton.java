package com.nit.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@DisplayName("Employee test")
public class EmpTestAnnotaton {

	// @Test
	@RepeatedTest(value = 3)
	public void TestMultiple() {
		System.out.println("hello test");
	}

	@DisplayName(value = "MULTIPLE TEST2 ")
	@RepeatedTest(value = 2, name = "{displayName}-{currentRepetition}/{totalRepetitions}")
	public void TestMultiple2(TestInfo info) {
		System.out.println("Hello:  " + info.getTestClass().get().getName());
		System.out.println("Hello:  " + info.getDisplayName());
		System.out.println("Hello: " + info.getTestMethod().get().getName());
	}

	@Test
	@Tag(value = "dev")
	public void testA() {
		System.out.println("TEST-A");
	}

	@Test
	@Tag(value = "prod")
	public void testB() {
		System.out.println("TEST-B");
	}

}
