package com.yash.assignment2_tdd;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;


public class testItemQue15 {
	  @Test
	    void test() {
	        Item i=new Item(123,"ajinkya",100,150,LocalDate.of(2020, 11, 23),LocalDate.of(2020, 12, 27));
	        assertEquals(true,i.createObject(i));
	    }
}
