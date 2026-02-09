package com.capg.java;

import junit.framework.TestCase;

public class CalculationTest extends TestCase{
	Calculation calculator;
	
	//Runs before each test method
	protected void setUp() {
		calculator = new Calculation();
	}
	
	//Test method (name must starts with 'test')
	public void testAdd() {
		int res = calculator.addition(2, 3);
		assertEquals(5,res);
	}
	
	//Runs after each test method
	protected void tearDown() {
		calculator = null;
	}
}
