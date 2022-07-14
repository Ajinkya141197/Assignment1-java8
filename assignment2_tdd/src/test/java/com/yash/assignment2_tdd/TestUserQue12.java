package com.yash.assignment2_tdd;

import org.junit.Test;

import junit.framework.Assert;

public class TestUserQue12 {
    @Test
    public void test() {


    	Assignment2Q12 q=new Assignment2Q12("ajinkya","shitole");
    	Assignment2Q12 q1=new Assignment2Q12("ajinkya","shitole");
        Assert.assertEquals(q, q1);
    }

}
