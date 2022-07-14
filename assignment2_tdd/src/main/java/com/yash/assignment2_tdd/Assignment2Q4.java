package com.yash.assignment2_tdd;

public class Assignment2Q4 {

	public boolean armstrongnum(int i) {

        int  originalNumber, remainder, result = 0;

        originalNumber = i;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == i)
        	return true;
        else
        	return false;
		
	}

}
