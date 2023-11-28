package com.myjava.ds.implementation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StackImplTest {
	@Test
	public void test1()
	{
		StackImpl stack=new StackImpl(5);
		assertTrue(stack.isEmpty());
		assertFalse(stack.isFull());
		stack.push(1);
		assertEquals(1, stack.peek());
		stack.push(2);
		assertEquals(2, stack.peek());
		stack.push(3);
		assertEquals(3, stack.peek());
		stack.push(4);
		assertEquals(4, stack.peek());
		stack.push(5);
		assertEquals(5, stack.peek());
		assertEquals(5, stack.size());
		assertTrue(stack.isFull());
		assertEquals(5, stack.pop());
		assertEquals(4, stack.pop());
		assertEquals(3, stack.pop());
		assertEquals(2, stack.pop());
		assertEquals(1, stack.pop());
	}
	
	@Test(expected = StackEmptyException.class)
	public void test2()
	{
		StackImpl stack=new StackImpl(5);
		assertTrue(stack.isEmpty());
		stack.peek();
	}
	
	@Test(expected = StackFullException.class)
	public void test3()
	{
		StackImpl stack=new StackImpl(5);
		assertTrue(stack.isEmpty());
		stack.push(1);
		assertEquals(1, stack.peek());
		stack.push(2);
		assertEquals(2, stack.peek());
		stack.push(3);
		assertEquals(3, stack.peek());
		stack.push(4);
		assertEquals(4, stack.peek());
		stack.push(5);
		assertEquals(5, stack.peek());
		stack.push(6);
	}
}
