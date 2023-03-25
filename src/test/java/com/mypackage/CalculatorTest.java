package com.mypackage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator objCalcTest;
	
	@Before
	public void setUp() {
	
	objCalcTest = new Calculator();
	}  
	
	@Test
	public void testAdd() { 
		int a = 15; int b = 20; 
		int expectedResult = 35;
		long result = objCalcTest.add(a, b);
		Assert.assertEquals(expectedResult, result);
		}
	
	@Test
	public void testSubtract() {
	int a = 25; int b = 20; 
	int expectedResult = 5; 
	long result = objCalcTest.subtract(a, b);
	Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void testMultiply() {
	int a = 10; int b = 25;
	long expectedResult = 250;
	long result = objCalcTest.multiply(a, b);
	Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void testDivide() {
	int a = 56; int b = 10; 
	double expectedResult = 5.6; 
	double result = objCalcTest.divide(a, b);
	Assert.assertEquals(expectedResult, result,0.00005); 
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivideByZero() { 
	int a = 15; int b = 0;
	objCalcTest.divide(a, b);
	} 
}
