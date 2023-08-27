package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestElementTest {
	@Test
	public void main(String[] args)
	{
		assertEquals(6, LargestElement.largestElement(new int[] { 4,7,8,6,7,6 }, 6));
	}
}
