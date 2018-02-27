import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Matchers;
import org.mockito.Mockito;

public class StarWarsTest {

	
	@Test
	public void testCaptor() {
		
		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		
		Robot r2d2 = mock(Robot.class);

		List<String> fakeMemories = Arrays.asList("Death Star Plans",
				"Figther Control Instructions", "Naboo travel guide");
		
		LukeSkywalker luke = new LukeSkywalker(r2d2);
		
		luke.makeRobotForget("Death Star");
		
		verify(r2d2).removeMemoriesAbout(captor.capture());
		
		assertEquals("Death Star", captor.getValue());
		
	}

	
	@Test
	public void test() {
		Robot r2d2 = mock(Robot.class);

		List<String> fakeMemories = Arrays.asList("Death Star Plans",
				"Figther Control Instructions", "Naboo travel guide");
		
		when(r2d2.getMemories()).thenReturn(fakeMemories);
		
		LukeSkywalker luke = new LukeSkywalker(r2d2);
		
		List<String> deathStarMemories = luke.askRobotAbout("Death Star");
		
		assertEquals(1, deathStarMemories.size());
		

	}
	
	@Test
	public void testVerify() throws Exception {
		
		Robot c3po = mock(Robot.class);
		
		List<String> fakeMemories = Arrays.asList("English", "French", "Jaja");
		
		LukeSkywalker luke = new LukeSkywalker(c3po);
		
		luke.makeRobotForget("Jaja");
		
		verify(c3po, atLeastOnce()).removeMemoriesAbout("Jaja");
//		verify(c3po, never()).removeMemoriesAbout("Death Star");
//		verify(c3po, times(1)).removeMemoriesAbout("Jaja");
//		verify(c3po, atLeastOnce()).removeMemoriesAbout("Jaja");
		
	}
	
	@Test
	public void bdd_style() {
		
		
		Robot r2d2 = mock(Robot.class);

		List<String> fakeMemories = Arrays.asList("Death Star Plans",
				"Figther Control Instructions", "Naboo travel guide");
		
		// given
		given(r2d2.getMemories()).willReturn(fakeMemories);
		
		// when
		LukeSkywalker luke = new LukeSkywalker(r2d2);
		
		List<String> deathStarMemories = luke.askRobotAbout("Death Star");
		
		// then
		assertThat(deathStarMemories.size(), CoreMatchers.is(1));
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
