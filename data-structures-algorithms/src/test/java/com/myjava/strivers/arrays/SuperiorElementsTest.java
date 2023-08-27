package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SuperiorElementsTest {
	@Test
	public void test1()
	{
		assertEquals(Arrays.asList(32,107,162),SuperiorElements.superiorElements(new int[] {148,162,85,18,107,32 }));
		assertEquals(Arrays.asList(32,107,162),SuperiorElements.superiorElement(new int[] {148,162,85,18,107,32 }));
	}
}
