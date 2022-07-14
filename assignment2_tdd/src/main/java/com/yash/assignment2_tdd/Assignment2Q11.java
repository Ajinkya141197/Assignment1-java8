package com.yash.assignment2_tdd;


public class Assignment2Q11 {
	   private static  Assignment2Q11 singletonInstance = new Assignment2Q11();

	    private Assignment2Q11() {

	    }

	    public static Assignment2Q11 getInstance() {
	        // TODO Auto-generated method stub
	        return singletonInstance;
	    }

}
