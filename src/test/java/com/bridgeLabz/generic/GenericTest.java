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
	public void GivenIntegerArrayWithMaxAtThird_returnsCorrectMax_shouldAnswerWithTrue() {
		Integer[] arr = { 1, 2, 3 };
		FindMax findMax = new FindMax();
		Integer max = findMax.Max(arr);
		assertTrue(max == 3);
	}

	@Test
	public void GivenIntegerArrayWithMaxAtSecond_returnsCorrectMax_shouldAnswerWithTrue() {
		Integer[] arr = { 1, 3, 2 };
		FindMax findMax = new FindMax();
		Integer max = findMax.Max(arr);
		assertTrue(max == 3);
	}

	@Test
	public void GivenIntegerArrayWithMaxAtFirst_returnsCorrectMax_shouldAnswerWithTrue() {
		Integer[] arr = { 3, 2, 1 };
		FindMax findMax = new FindMax();
		Integer max = findMax.Max(arr);
		assertTrue(max == 3);
	}
}
