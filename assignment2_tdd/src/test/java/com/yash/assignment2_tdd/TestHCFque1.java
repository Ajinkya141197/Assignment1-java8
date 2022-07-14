package com.yash.assignment2_tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestHCFque1 {

	@Test
	public void test_HCF() {
		Assignment2Q1 q1 = new Assignment2Q1();
		int result = q1.HCF(4,8);
		assertEquals(result, 4);
	}
}
