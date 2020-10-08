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

	@Test
	public void GivenFloatArrayWithMaxAtFirst_returnsCorrectMax_shouldAnswerWithTrue() {
		Float[] arr = { 3.1f, 2.9f, 1.0f };
		FindMax findMax = new FindMax();
		Float max = findMax.Max(arr);
		assertTrue(max == 3.1f);
	}

	@Test
	public void GivenFloatArrayWithMaxAtSecond_returnsCorrectMax_shouldAnswerWithTrue() {
		Float[] arr = { 1.0f, 3.1f, 2.9f };
		FindMax findMax = new FindMax();
		Float max = findMax.Max(arr);
		assertTrue(max == 3.1f);
	}

	@Test
	public void GivenFloatArrayWithMaxAtThird_returnsCorrectMax_shouldAnswerWithTrue() {
		Float[] arr = { 2.9f, 1.0f, 3.1f };
		FindMax findMax = new FindMax();
		Float max = findMax.Max(arr);
		assertTrue(max == 3.1f);
	}

	@Test
	public void GivenStringArrayWithMaxAtFirst_returnsCorrectMax_shouldAnswerWithTrue() {
		String[] arr = { "peach", "apple", "banana" };
		FindMax findMax = new FindMax();
		String max = findMax.Max(arr);
		assertTrue(max.matches("peach"));
	}

	@Test
	public void GivenStringArrayWithMaxAtSecond_returnsCorrectMax_shouldAnswerWithTrue() {
		String[] arr = { "apple", "peach", "banana" };
		FindMax findMax = new FindMax();
		String max = findMax.Max(arr);
		assertTrue(max.matches("peach"));
	}

	@Test
	public void GivenStringArrayWithMaxAtThird_returnsCorrectMax_shouldAnswerWithTrue() {
		String[] arr = { "apple", "banana", "peach" };
		FindMax findMax = new FindMax();
		String max = findMax.Max(arr);
		assertTrue(max.matches("peach"));
	}
}
