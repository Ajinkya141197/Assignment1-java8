package com.yash.assignment2_tdd;

public class Assignment2Q5 {

	public boolean pytha(int a, int b, int c) {
		if (a * a + b * b == c * c ||
	            a * a + c * c == b * b ||
	            b * b + c * c == a * a)
	           return true;
	        else
	            return false;
	}
	

}
