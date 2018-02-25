package com.epam.tdd.lesson180220;

public class SomeSlowRemoteService implements AddTwoService {

	@Override
	public int doIt(int state) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return state+2;
	}

}
