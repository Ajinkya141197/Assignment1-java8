package com.yash.assignment2_tdd;

public class Assignment2Q7 {

	
	public boolean palindromeNum(int i) {
		
		 int temp=i; 
		 int r=0, sum=0;
		  while(i>0){    
		    r=i%10;   
		   sum=(sum*10)+r;    
		   i=i/10;    
		  }    
		  if(temp==sum)    
		   return true;    
		  else        
		return false;
	}
	

}
