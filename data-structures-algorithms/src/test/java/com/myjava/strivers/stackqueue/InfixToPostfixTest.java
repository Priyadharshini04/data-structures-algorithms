package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InfixToPostfixTest {
	@Test
	public void test1() {
		assertEquals("348*+", InfixToPostfix.infixToPostfix("3+4*8"));
	}

	@Test
	public void test2() {
		assertEquals("311+^", InfixToPostfix.infixToPostfix("3^(1+1)"));
	}

	@Test
	public void test3() {
		assertEquals("ab+c+d+e-", InfixToPostfix.infixToPostfix("a+b+c+d-e"));
	}

	@Test
	public void test4() {
		assertEquals("32-l8/+463/58^*+-", InfixToPostfix.infixToPostfix("(3-2+l/8)-(4+6/3*(5^8))"));
	}

	@Test
	public void test5() {
		assertEquals("abcd^e-fgh*+^*+i-", InfixToPostfix.infixToPostfix("a+b*(c^d-e)^(f+g*h)-i"));
	}

	@Test
	public void test6() {
		assertEquals("38*1+", InfixToPostfix.infixToPostfix("3*8+1"));
	}
}
