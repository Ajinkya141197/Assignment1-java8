package com.yash.assignment2_tdd;

public class Assignment2Q9 {

	public String replaceSpecialChar(String string) {
		
		string = string.replaceAll("[^a-zA-Z0-9]", "");
		return string;
	}

}
