package lesson180220;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FibonacciParameterizedTest {
	
	private int input;
	private int expected;

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{0, 0},
			{1, 1},
			{2, 1},
			{3, 2},
			{4, 3},
			{5, 5},
			{6, 8},
			{50, 100000},
		});
	}
	
	public FibonacciParameterizedTest(int input, int expected) {
		this.input = input;
		this.expected = expected;
	}

	@Test(timeout=10)
	public void test() {
		Fibonacci fb = new Fibonacci();  // fixture ->  SUT
		// System Under Test
		int fib = fb.fib(input);  // exercise
		assertEquals(expected, fib);   // verify
	}
	
}
