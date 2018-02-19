package lesson180216;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTestCase {

	@Test
	public void shouldReturnFizzWhen3() {
		FizzBuzz fb = new FizzBuzz();
		String result = fb.fizzBuzz(3);
		assertEquals("fizz", result);
	}

	@Test
	public void shouldReturnFizzWhen6() {
		FizzBuzz fb = new FizzBuzz();
		String result = fb.fizzBuzz(6);
		assertEquals("fizz", result);
	}
	
	@Test
	public void shoudReturnBuzzWhen5() {
		FizzBuzz fb = new FizzBuzz();
		String result = fb.fizzBuzz(5);
		assertEquals("buzz", result);
	}
	
	@Test
	public void shoudReturnBuzzWhen10() {
		FizzBuzz fb = new FizzBuzz();
		String result = fb.fizzBuzz(10);
		assertEquals("buzz", result);
	}
	
	@Test
	public void shoudReturnFizzBuzzWhen15() {
		FizzBuzz fb = new FizzBuzz();
		String result = fb.fizzBuzz(15);
		assertEquals("fizzbuzz", result);
	}
	
	@Test
	public void shoudReturnNumberAsStringWhenNumber() {
		FizzBuzz fb = new FizzBuzz();
		String result = fb.fizzBuzz(7);
		assertEquals("7", result);
	}
	
	@Test
	public void shouldThrowExceptionWhenNegativeNumber() throws Exception {
		FizzBuzz fb = new FizzBuzz();
		try {
			fb.fizzBuzz(-1);
			fail("Should throw IllegalArgumentException");
		} catch (IllegalArgumentException e) {
		}
	}
	
}
