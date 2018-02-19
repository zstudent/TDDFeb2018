package lesson180219;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FizzBuzzTestCase {
	
	private int input;
	private String expected;
	private FizzBuzz fb;
	
	{
		System.out.println("new instance");
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{3, "fizz"},
			{6, "fizz"},
			{5, "buzz"},
			{10, "buzz"},
			{15, "fizzbuzz"},
			{7, "7"},
		});
	}
	
	public FizzBuzzTestCase(int input, String expected) {
		this.input = input;
		this.expected = expected;
	}
	
	@Before
	public void setup() {
		fb = new FizzBuzz();
	}
	
	// 3, 6, 5, 10, 15, 7

	@Test
	public void shouldReturnExpectedWhenInput() {
		String result = fb.fizzBuzz(input);
		assertEquals(expected, result);
	}

	@Test
	public void shouldThrowExceptionWhenNegativeNumber() throws Exception {
		try {
			fb.fizzBuzz(-1);
			fail("Should throw IllegalArgumentException");
		} catch (IllegalArgumentException e) {
		}
	}
	
}
