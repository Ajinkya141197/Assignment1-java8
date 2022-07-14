package com.yash.assignment2_tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestSingletonQue11 {
	  @Test
	    public void test() {
		  Assignment2Q11 instance1 = Assignment2Q11.getInstance();
		  Assignment2Q11 instance2 = Assignment2Q11.getInstance();
	        
	         assertEquals(true, instance1==instance2);

	    }

}
