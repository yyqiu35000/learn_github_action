package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testAddPositiveNumbers() {
		Main main = new Main();
		int result = main.add(1, 1);
		assertEquals(2, result);
	}

	@Test
	void testAddWithFirstNegative() {
		Main main = new Main();
		assertThrows(IllegalArgumentException.class, () -> main.add(-1, 5));
	}

	@Test
	void testAddWithSecondNegative() {
		Main main = new Main();
		assertThrows(IllegalArgumentException.class, () -> main.add(5, -1));
	}

	@Test
	void testAddWithBothNegative() {
		Main main = new Main();
		assertThrows(IllegalArgumentException.class, () -> main.add(-1, -1));
	}

	@Test
	void testAddWithIntegerOverflow() {
		Main main = new Main();
		assertThrows(ArithmeticException.class, () -> main.add(Integer.MAX_VALUE, 1));
	}

	@Test
	void testAddMaxIntWithZero() {
		Main main = new Main();
		int result = main.add(Integer.MAX_VALUE, 0);
		assertEquals(Integer.MAX_VALUE, result);
	}

	@Test
	void testAddZeroWithMaxInt() {
		Main main = new Main();
		int result = main.add(0, Integer.MAX_VALUE);
		assertEquals(Integer.MAX_VALUE, result);
	}

	@Test
	void testAddLargeNumbersNoOverflow() {
		Main main = new Main();
		int result = main.add(Integer.MAX_VALUE / 2, Integer.MAX_VALUE / 2);
		assertEquals(Integer.MAX_VALUE - 1, result);
	}

}
