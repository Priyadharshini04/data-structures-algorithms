package com.myjava.strivers.recursion;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;


public class FibonnacciTest {

	@Test
	public void test1() {
        assertArrayEquals(new int[] {0,1,1,2,3}, Fibonnacci.fibSeries(5));
    }
}
