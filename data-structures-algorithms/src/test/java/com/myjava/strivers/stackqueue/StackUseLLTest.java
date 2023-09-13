package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StackUseLLTest {
	@Test
	public void test1()
	{
		StackUseLL.Stack stk = new StackUseLL.Stack();
		assertTrue(stk.isEmpty());
		stk.push(7);
		assertEquals(7,stk.getTop());
		stk.push(4);
		assertEquals(4, stk.getTop());
		stk.pop();
		assertEquals(7,stk.getTop());
		stk.pop();
		assertTrue(stk.isEmpty());
		assertEquals(-1,stk.getTop());	
	}
	
	@Test
	public void test2()
	{
		StackUseLL.Stack stk = new StackUseLL.Stack();
		assertTrue(stk.isEmpty());
		stk.push(7);
		assertEquals(7,stk.getTop());
		stk.push(4);
		assertEquals(4, stk.getTop());
		stk.pop();
		stk.push(3);
		assertEquals(3, stk.getTop());
	}
}
