package com.epam.tdd.lesson180220;

import org.junit.Test;

public class FibonacciNegativeNumbersTest {

//	@Test
//	public void shouldThrowExceptionWhenNegative() throws Exception {
//		Fibonacci fb = new Fibonacci(); // fixture -> SUT
//		try {
//			fb.fib(-1);
//			fail("Should throw IllegalArgumentException");
//		} catch (IllegalArgumentException e) {
//		}
//	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionWhenNegative2() throws Exception {
		Fibonacci fb = new Fibonacci(); // fixture -> SUT
		fb.fib(-1);  // com.epam.tdd.exercise
	}

}
