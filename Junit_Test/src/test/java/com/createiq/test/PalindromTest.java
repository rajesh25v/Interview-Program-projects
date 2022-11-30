package com.createiq.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.createiq.bean.Palindrom1;

public class PalindromTest {
	@ParameterizedTest
	@ValueSource(strings = {"raceres", "radar", "liril","python race trace","madam" })
	public void testIsPalindrom(String str) {
		
		Palindrom1 p=new Palindrom1();
		 boolean actual=p.isPalindrom(str);
		 assertTrue(actual);
		 
	}

}
