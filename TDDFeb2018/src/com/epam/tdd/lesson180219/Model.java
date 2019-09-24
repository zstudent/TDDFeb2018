package com.epam.tdd.lesson180219;

public class Model {
	
	static {
		System.err.println("Model static init");
	}
	
	{
		System.err.println("Model instance init");
	}
	
	public Model() {
		System.err.println("Model constructor");
	}
	
	public void m1() {}
	public void m2() {}

}
