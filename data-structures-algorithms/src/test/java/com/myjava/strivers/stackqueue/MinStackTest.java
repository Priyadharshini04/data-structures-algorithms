package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinStackTest {
	@Test
	public void test1() {
		MinStack stk = new MinStack();
		stk.push(8);
		stk.push(4);
		assertEquals(4, stk.getMin());
		stk.push(3);
		assertEquals(3, stk.getMin());
		stk.push(2);
		assertEquals(2, stk.getMin());
		stk.pop();
		assertEquals(3, stk.getMin());
		stk.pop();
		assertEquals(4, stk.getMin());
	}
	
	@Test
	public void test2() {
		MinStack stk = new MinStack();
		stk.push(0);
		stk.push(1);
		stk.push(0);
		assertEquals(0, stk.getMin());
		stk.pop();
		assertEquals(0, stk.getMin());
	}
	
	@Test
	public void test3() {
		MinStack stk = new MinStack();
		stk.push(2147483646);
		stk.push(2147483646);
		stk.push(2147483647);
		assertEquals(2147483647, stk.top());
		stk.pop();
		assertEquals(2147483646, stk.getMin());
		stk.pop();
		assertEquals(2147483646, stk.getMin());
		stk.pop();
		stk.push(2147483647);
		assertEquals(2147483647, stk.top());
		assertEquals(2147483647, stk.getMin());
		stk.push(-2147483648);
		assertEquals(-2147483648, stk.top());
		assertEquals(-2147483648, stk.getMin());
		stk.pop();
		assertEquals(2147483647, stk.getMin());
	}
}
