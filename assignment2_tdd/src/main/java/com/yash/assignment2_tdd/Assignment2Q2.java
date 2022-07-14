package com.yash.assignment2_tdd;

public class Assignment2Q2 {


	public boolean palindrome(String string, String string2) {
		
		String nstr="";
        char ch;
		   
	      for (int i=0; i<string.length(); i++)
	      {
	        ch= string.charAt(i);
	        nstr= ch+nstr;
	      }
	      
	      if(nstr.toLowerCase().equals(string2.toLowerCase())) {
	    	  return true;
	      }else 
	      {return false;}
	      
	     
	    }
	}


