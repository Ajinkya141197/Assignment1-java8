package com.yash.assignment2_tdd;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestPythagorusTriplateQue5 {
	@Test
	public void TestPythagorus() {
		Assignment2Q5 q5= new Assignment2Q5();
		assertTrue(q5.pytha(3,4,6));		
	}

}
