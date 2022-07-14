package com.yash.assignment2_tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestConcreteStringQue10 {
	
	@Test
	public void test_Concrete_string_in_array() {
		Assignment2Q10 q10= new Assignment2Q10();
		assertEquals(q10.convertArrayToString(new String[] {"aj","in","ky","a"}), "aj-in-ky-a");
	}

}
