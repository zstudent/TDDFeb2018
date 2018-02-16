package lesson180216;

public class ModelTest {

	public void testModel() {
		Model model = new Model();
		
		model.change();
		
		TestFramework.assertEquals(model.state, 1);
		
	}
}
