package com.yash.assignment2_tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDataQue3 {

	@Test
	public void test_data_match() {
		Assignment2Q3 q3= new Assignment2Q3();
		
		assertEquals(q3.checkEmailAndPass("prakash@gmail.com","1444"),true);
	}
}
