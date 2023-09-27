package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class NextGreaterElementArraySubSet_L496Test {
	@Test
	public void test1()
	{
		assertArrayEquals(new int[] {-1,3,-1}, NextGreaterElementArraySubSet_L496.nextGreaterElement(new int[] {4,1,2},new int[] {1,3,4,2}));
	}
}
