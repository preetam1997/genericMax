package com.bridgeLabz.generic;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class GenericTest {
	/**
	 * Rigorous Test :-)
	 */
	

	@Test
	public void GivenIntegerArrayWithMaxAtFirst_returnsCorrectMax_shouldAnswerWithTrue() {
		Integer[] xArr = { 3, 2, 1 };
		Float[] yArr = { 3.1f, 2.9f, 1.0f };
		String[] zArr = { "peach", "apple", "banana" };
		FindMax findMax = new FindMax<Integer,Float,String>(xArr,yArr,zArr);
		Integer xArrMax = (Integer)findMax.Max(xArr);
		Float yArrMax = (Float)findMax.Max(yArr);
		String zArrMax = (String)findMax.Max(zArr);
		assertTrue(xArrMax==3);
		assertTrue(yArrMax==3.1f);
		assertTrue(zArrMax.matches("peach"));
		
		
	}

}
