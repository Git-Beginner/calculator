package com.ex;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestCalculator extends TestCase{

	public void testSum1(){
		Calculator calculator = new Calculator();
		Assert.assertEquals(3, calculator.sum(1, 2));
	}
	
	public void testSum2(){
		Calculator calculator = new Calculator();
		Assert.assertEquals(3, calculator.sum(5, 2));
	}
	
}
