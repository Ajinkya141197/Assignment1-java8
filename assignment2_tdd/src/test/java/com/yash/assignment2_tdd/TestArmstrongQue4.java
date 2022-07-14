package com.yash.assignment2_tdd;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestArmstrongQue4 {
	
	@Test
	public void TestarmstrongNum() {
		Assignment2Q4 q4= new Assignment2Q4();
		assertTrue(q4.armstrongnum(153));
	}

}
