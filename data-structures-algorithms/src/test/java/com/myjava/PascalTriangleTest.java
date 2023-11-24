package com.myjava;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PascalTriangleTest {
	@Test
	public void test1()
	{
		List<Long> expected=Arrays.asList(1L,3L,3L,1L);
		List<Long> actual = PascalTriangle.nthRowOfPascalTriangle(4);
		assertTrue( expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected) );
	}
	
	@Test
	public void test2()
	{
		List<Long> expected=Arrays.asList(1L);
		List<Long> actual = PascalTriangle.nthRowOfPascalTriangle(1);
		assertTrue( expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected) );
	}
	
	@Test
	public void test3()
	{
		List<Long> expected=Arrays.asList(1L,5L,10L,10L,5L,1L);
		List<Long> actual = PascalTriangle.nthRowOfPascalTriangle(6);
		assertTrue( expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected) );
	}
}
