package com.yash.assignment2_tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestReplaceSpecialCharQue9 {
	@Test
	public void Test_string_replace_special_char() {
		Assignment2Q9 q9 = new Assignment2Q9();
		assertEquals(q9.replaceSpecialChar("aji#@%^&nk%$%&^   y@$a"), "ajinya");
	}

	
}
