package com.yash.assignment2_tdd;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestPalindromeQue2 {
	
	Assignment2Q2 q2= new Assignment2Q2();
	
	@Test
	public void Test_palindrome() {
		assertTrue(q2.palindrome("aba", "aBa"));
	}

}
