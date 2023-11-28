package com.myjava.ds.implementation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StackLLImpleTest {
	@Test(expected = StackEmptyException.class)
	public void test1() {
		StackLLImple stack = new StackLLImple();
		//stack.peek();
		stack.pop();
	}

	public void test2() {
		StackLLImple stack = new StackLLImple();
		assertTrue(stack.isEmpty());
		assertEquals(0, stack.size());
		stack.push(1);
		assertEquals(1, stack.peek());
		stack.push(2);
		assertEquals(2, stack.peek());
		stack.push(3);
		assertEquals(3, stack.peek());
		stack.push(4);
		assertEquals(4, stack.peek());
		assertEquals(4, stack.size());
		
		assertEquals(4, stack.pop());
		assertEquals(3, stack.pop());
		assertEquals(2, stack.pop());
		assertEquals(2, stack.size());
		assertEquals(1, stack.pop());
		assertEquals(0, stack.size());
		assertTrue(stack.isEmpty());
	}
}
