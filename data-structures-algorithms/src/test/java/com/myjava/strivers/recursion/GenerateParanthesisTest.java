package com.myjava.strivers.recursion;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class GenerateParanthesisTest {
	@Test
	public void test1() {
		assertEquals(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"),
				GenerateParanthesis.generateParenthesis(3));
	}

	@Test
	public void test2() {
		assertEquals(Arrays.asList("()"), GenerateParanthesis.generateParenthesis(1));
	}
}
