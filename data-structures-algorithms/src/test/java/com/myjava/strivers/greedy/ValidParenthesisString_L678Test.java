package com.myjava.strivers.greedy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidParenthesisString_L678Test {
	@Test
	public void test1() {
		assertTrue(ValidParenthesisString_L678.checkValidString("()"));
	}

	@Test
	public void test2() {
		assertFalse(ValidParenthesisString_L678.checkValidString("(()()))"));
	}

	@Test
	public void test3() {
		assertTrue(ValidParenthesisString_L678.checkValidString("(*)"));
	}

	@Test
	public void test4() {
		assertTrue(ValidParenthesisString_L678.checkValidString("(*))"));
	}

	@Test
	public void test5() {
		assertTrue(ValidParenthesisString_L678.checkValidString(
				"((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()"));
	}

	@Test
	public void test6() {
		assertFalse(ValidParenthesisString_L678.checkValidString(
				"(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())"));
	}

	@Test
	public void test7() {
		assertTrue(ValidParenthesisString_L678.checkValidString(
				"((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()"));
	}
}
