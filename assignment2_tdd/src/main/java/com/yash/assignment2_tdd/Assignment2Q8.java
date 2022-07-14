package com.yash.assignment2_tdd;

public class Assignment2Q8 {

	public boolean checkNumberAndArray(int[] is, int i) {
		  boolean c=false;

	        for (int d:is) {
	            if (d == i && i % 2 == 0) {
	                c=true;

	            } 
	        }return c;
	}

}
