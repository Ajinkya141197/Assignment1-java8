package com.yash.assignment2_tdd;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestPalindromeNumberQue7 {

	@Test
	public void test_palindrome_number() {
		Assignment2Q7 q7 = new Assignment2Q7();
		assertTrue(q7.palindromeNum(354)); 	
	}
}
