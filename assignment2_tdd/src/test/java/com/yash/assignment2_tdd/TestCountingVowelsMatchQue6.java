package com.yash.assignment2_tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCountingVowelsMatchQue6 {
	
	@Test
	public void Match_count_to_vowel_Count() {
		Assignment2Q6 q6 = new Assignment2Q6();	
		assertEquals(2, q6.countOfVowel("ajinkya"));
	}

}
