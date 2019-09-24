package com.epam.tdd.lesson180216;


import static org.junit.Assert.*;

import org.junit.Test;

import com.epam.tdd.lesson180216.Model;

public class TestModel {

	@Test
	public void test() {
		Model model = new Model();
		model.change();
		assertEquals(model.state, 1);
	}

}
