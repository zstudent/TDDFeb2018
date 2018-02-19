package lesson180219;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModelTest2 {

	private Model model;

	@BeforeClass
	static public void setupClass() {
		System.out.println("BeforeClass");
	}
	
	@Before
	public void setup() {
		System.out.println("before");
		model = new Model();
	}
	
	@After
	public void tearDown() {
		System.out.println("after");
	}
	
	@Test
	public void t1() throws Exception {
		System.out.println("t1");
		model.m1();
	}

	@Test
	public void t2() throws Exception {
		System.out.println("t2");
		model.m2();
	}
	
	@AfterClass
	static public void tearDownClass() {
		System.out.println("AfterClass");
	}
	
}
