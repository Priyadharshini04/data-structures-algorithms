package com.myjava.strivers.bits;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SwapTwoNumbersTest {
	@Test
	public void test1()
	{
		int[] a=new int[] {6};
		int[] b=new int[] {5};
		SwapTwoNumbers.swap(a,b);
		assertEquals(5,a[0]);
		assertEquals(6,b[0]);
	}
}
