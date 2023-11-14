package com.myjava.strivers.strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumNestingDepthParentheses_L1614Test {
	@Test
	public void test1()
	{
		assertEquals(3, MaximumNestingDepthParentheses_L1614.maxDepth("(1+(2*3)+((8)/4))+1"));
	}
}
