package com.epam.tdd.lesson180220;

public class Fibonacci {

	public int fib(int n) {
		
		if (n < 0)
			throw new IllegalArgumentException();
		
		if (n < 2)
			return n;
		
		return fib(n-1) + fib(n-2);
	}

}
