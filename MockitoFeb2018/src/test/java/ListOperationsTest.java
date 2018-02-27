import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;

public class ListOperationsTest {

	@Test
	public void test1() {
		List list = mock(List.class);
		
		when(list.size()).thenReturn(10);
		
		assertEquals(10, list.size());
	}

	@Test
	public void test2() {
		List list = mock(List.class);
		
		when(list.size()).thenReturn(10).thenReturn(20);
		
		assertEquals(10, list.size());
		assertEquals(20, list.size());
	}
	
	@Test
	public void test3() {
		List list = mock(List.class);
		
		when(list.get(0)).thenReturn("Death Star");
		
		assertEquals("Death Star", list.get(0));
		assertEquals(0, list.size());
		assertEquals(null, list.get(1));
	}
	
	@Test
	public void test4() {
		List list = mock(List.class);
		
		when(list.get(anyInt())).thenReturn("Death Star");
		
		assertEquals("Death Star", list.get(0));
		assertEquals(0, list.size());
		assertEquals("Death Star", list.get(1));
	}
	
	
	@Test(expected=RuntimeException.class)
	public void test5() {
		List list = mock(List.class);
		
		when(list.get(anyInt())).thenThrow(new RuntimeException());
		
		list.get(20);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
