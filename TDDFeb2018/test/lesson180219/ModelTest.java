package lesson180219;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModelTest {
	
	// fixture
	
	// Before/After  BeforeClass/AfterClass
	
	static {
		System.out.println("static");
	}
	
	{
		System.out.println("instance");
	}
	
	public ModelTest() {
		System.out.println("constructor");
	}

	@Test
	public void testM1() {
		System.out.println("test m1");
	}

	@Test
	public void testM2() {
		System.out.println("test m2");
	}

}
