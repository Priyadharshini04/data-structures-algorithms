package com.myjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountTotalNumbersTest {
	@Test
	public void test1()
	{
		assertEquals(6, CountTotalNumbers.totalCount(156478) );
	}
}
