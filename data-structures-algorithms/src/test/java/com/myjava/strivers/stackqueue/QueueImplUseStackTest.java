package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class QueueImplUseStackTest {
	@Test
	public void test1()
	{
		QueueImplUseStack.MyQueue que=new QueueImplUseStack().new MyQueue();
		que.push(1);
		que.push(3);
		que.push(4);
		que.push(5);
		assertEquals(1, que.pop());
		assertEquals(3, que.pop());
		assertEquals(4, que.pop());
		assertEquals(5, que.pop());
		assertTrue(que.empty());
	}
}
