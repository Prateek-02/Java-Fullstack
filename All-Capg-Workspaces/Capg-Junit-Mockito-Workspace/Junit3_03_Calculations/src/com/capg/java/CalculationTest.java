package com.capg.java;

import junit.framework.TestCase;

public class CalculationTest extends TestCase {
	
	Calculation cal;
	
	protected void setUp() {
		cal = new Calculation();
	}
	
	public void testAll() {
		
		assertEquals(5,cal.addition(2,3));
//		assertEquals(8,cal.addition(3,3)); // negative
		
		assertEquals(10,cal.subtraction(15,5));
//		assertEquals(12,cal.subtraction(15,5)); //negative
		
		assertEquals(4,cal.multiplication(2,2));
//		assertEquals(4,cal.multiplication(2,3)); //negative
		
		assertEquals(9,cal.division(18,2));
//		assertEquals(9,cal.division(10,2));  // negative
		
	}
	
	protected void tearDown() {
		cal = null;
	}
	
	
}
