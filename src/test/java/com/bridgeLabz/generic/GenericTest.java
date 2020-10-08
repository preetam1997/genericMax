package com.bridgeLabz.generic;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class GenericTest {
	/**
	 * Rigorous Test :-)
	 */
	FindMax findMax;
	@Before
	public void initialize() {
		findMax = new FindMax();
	}

	@Test
	public void GivenIntegerArrayWithMaxAtFirst_returnsCorrectMax_shouldAnswerWithTrue() {
		
		Integer xArrMax = (Integer) findMax.Max(99, 3, 2, 1);
		Float yArrMax = (Float) findMax.Max(9.88f, 3.1f, 2.9f, 1.0f);
		String zArrMax = (String) findMax.Max("zucchini", "peach", "apple", "banana");
		assertTrue(xArrMax == 99);
		assertTrue(yArrMax == 9.88f);
		assertTrue(zArrMax.matches("zucchini"));}

	@Test
	public void GivenIntegerArrayWithMaxAtSecond_returnsCorrectMax_shouldAnswerWithTrue() {
		Integer xArrMax = (Integer) findMax.Max(3, 99, 2, 1);
		Float yArrMax = (Float) findMax.Max(3.1f, 9.88f, 2.9f, 1.0f);
		String zArrMax = (String) findMax.Max("peach", "zucchini", "apple", "banana");
		assertTrue(xArrMax == 99);
		assertTrue(yArrMax == 9.88f);
		assertTrue(zArrMax.matches("zucchini"));

	}

	@Test
	public void GivenIntegerArrayWithMaxAtThird_returnsCorrectMax_shouldAnswerWithTrue() {
		Integer xArrMax = (Integer) findMax.Max(2, 3, 99, 1);
		Float yArrMax = (Float) findMax.Max(2.9f, 3.1f, 9.88f, 1.0f);
		String zArrMax = (String) findMax.Max("apple", "peach", "zucchini", "banana");
		assertTrue(xArrMax == 99);
		assertTrue(yArrMax == 9.88f);
		assertTrue(zArrMax.matches("zucchini"));

	}

	@Test
	public void GivenIntegerArrayWithMaxAtfourth_returnsCorrectMax_shouldAnswerWithTrue() {
		Integer xArrMax = (Integer) findMax.Max(1, 2, 3, 99);
		Float yArrMax = (Float) findMax.Max(1.0f, 2.9f, 3.1f, 9.88f);
		String zArrMax = (String) findMax.Max("banana", "apple", "peach", "zucchini");
		assertTrue(xArrMax == 99);
		assertTrue(yArrMax == 9.88f);
		assertTrue(zArrMax.matches("zucchini"));

	}
}
