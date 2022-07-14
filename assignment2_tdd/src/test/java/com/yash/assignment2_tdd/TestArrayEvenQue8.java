package com.yash.assignment2_tdd;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestArrayEvenQue8 {
	@Test
	public void test_array_no_even() {
		Assignment2Q8 q8= new Assignment2Q8();
		assertTrue(q8.checkNumberAndArray(new int [] {1,2,3,4,5,6}, 1));
	}

}
