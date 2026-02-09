package com.capg.java;


import junit.framework.TestCase;

public class CalculationTest extends TestCase {
	public void testAll() {
		
		assertEquals(5,new Calculation().addition(2,3));
		assertEquals(10,new Calculation().subtraction(15,5));
		assertEquals(4,new Calculation().multiplication(2,2));
		assertEquals(9,new Calculation().division(18,2));
		
		
	}
}
