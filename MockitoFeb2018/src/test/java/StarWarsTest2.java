import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;

public class StarWarsTest2 {

	@Rule
	public MockitoRule mockitoRule = MockitoJUnit.rule(); 
	
	@Mock
	Robot r2d2;
	
	@InjectMocks
	LukeSkywalker luke;
	
	@Test
	public void test() {

		List<String> fakeMemories = Arrays.asList("Death Star Plans",
				"Figther Control Instructions", "Naboo travel guide");
		
		when(r2d2.getMemories()).thenReturn(fakeMemories);
		
		
		List<String> deathStarMemories = luke.askRobotAbout("Death Star");
		
		assertEquals(1, deathStarMemories.size());
		

	}
	
	

}
