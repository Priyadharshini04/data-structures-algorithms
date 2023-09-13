package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackImplementationTest {
	@Test
	public void test1() {
		StackImplementation.Stack stk = new StackImplementation.Stack(2);
		assertEquals(1,stk.isEmpty());
		assertEquals(0, stk.isFull());
		stk.push(7);
		assertEquals(7,stk.top());
		stk.push(4);
		assertEquals(4, stk.top());
		assertEquals(2, stk.size());
		assertEquals(1, stk.isFull());
		assertEquals(4, stk.pop());
		assertEquals(7, stk.pop());
		assertEquals(1, stk.isEmpty());
		assertEquals(0, stk.isFull());
		assertEquals(-1,stk.pop());
		assertEquals(-1,stk.top());
	}
}
