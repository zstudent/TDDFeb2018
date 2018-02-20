package lesson180220;

import static org.junit.Assert.*;

import org.junit.Test;

public class ATest {

	@Test(timeout=100)
	public void test() {
//		AddTwoService.service[0] = new AddTwoService() {
//			
//			@Override
//			public int doIt(int state) {
//				return state + 2;
//			}
//		};
		A a = new A(s -> s + 2);
		a.doIt();
		assertEquals(2, a.state);
	}

}
