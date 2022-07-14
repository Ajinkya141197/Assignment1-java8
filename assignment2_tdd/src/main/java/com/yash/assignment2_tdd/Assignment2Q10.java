package com.yash.assignment2_tdd;

public class Assignment2Q10 {

	public String convertArrayToString(String[] strings) {
		 String s1="";

	        int a = strings.length-1;
	        for(int i = 0;i<strings.length;i++) {
	            if(i==a)
	                s1 =s1+strings[i];
	            else
	                s1 =s1+strings[i]+"-";
	        }
	        return s1;
	}

}
