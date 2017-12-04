package com.ex;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestCalculator extends TestCase{

	public void testSum(){
		Calculator calculator = new Calculator();
		Assert.assertEquals(3, calculator.sum(1, 2));
	}
	
	public void testProduct(){
		Calculator calculator = new Calculator();
		Assert.assertEquals(10, calculator.product(5, 2));
	}
	
	public void testMinus(){
		Calculator calculator = new Calculator();
		Assert.assertEquals(3, calculator.minus(5, 2));
	}
	
	
}
