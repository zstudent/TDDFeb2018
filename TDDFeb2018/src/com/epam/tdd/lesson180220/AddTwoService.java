package com.epam.tdd.lesson180220;

public interface AddTwoService {

	final static AddTwoService[] service = new AddTwoService[1];

	int doIt(int state);

	static AddTwoService createAddTwoService() {
		return service[0] == null ?  new SomeSlowRemoteService() : service[0];
	}

}