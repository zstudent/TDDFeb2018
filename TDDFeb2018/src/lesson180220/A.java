package lesson180220;

public class A {
	
	int state;
	
//	AddTwoService add2service = AddTwoService.createAddTwoService();
	AddTwoService add2service;
	
	public A(AddTwoService add2service) {
		this.add2service = add2service;
	}

	public void doIt() {
		state = add2service.doIt(state);
	}

}
