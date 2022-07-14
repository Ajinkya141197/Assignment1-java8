package com.yash.assignment2_tdd;

public class Assignment2Q6 {
	int count=0;

	public int countOfVowel(String a) {
		 for (int i=0 ; i<a.length(); i++){
	         char ch = a.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
	            count ++;
	         }
	      }
		return count ;
	}

}
