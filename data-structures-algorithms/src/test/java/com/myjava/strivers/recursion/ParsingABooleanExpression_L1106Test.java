package com.myjava.strivers.recursion;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ParsingABooleanExpression_L1106Test {
	@Test
	public void test1() {
		assertFalse(ParsingABooleanExpression_L1106.parseBoolExpr("&(|(f))"));
	}

	@Test
	public void test2() {
		assertTrue(ParsingABooleanExpression_L1106.parseBoolExpr("!(&(f,t))&(f,f,f,t)"));
	}

	@Test
	public void test3() {
		assertTrue(ParsingABooleanExpression_L1106.parseBoolExpr("|(&(t,f,t),t)"));
	}

	@Test
	public void test4() {
		assertFalse(ParsingABooleanExpression_L1106.parseBoolExpr("|(&(t,f,t),!(t))"));
	}
}
