package com.yash.assignment2_tdd;

public class Assignment2Q1 {
	int a= 4, b=8;
	int hcf=0;

	public int HCF(int i, int j) {
	    for(i = 1; i <= a || i <= b; i++) {
	         if( a%i == 0 && b%i == 0 )
	         hcf = i;
	      }
		return hcf;
	}
}
