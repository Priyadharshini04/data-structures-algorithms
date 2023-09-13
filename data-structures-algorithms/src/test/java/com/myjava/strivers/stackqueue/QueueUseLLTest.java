package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QueueUseLLTest {
	@Test
	public void test1()
	{
		QueueUseLL que=new QueueUseLL();
		assertEquals(-1,que.pop());
		que.push(4);
		que.push(3);
		que.push(2);
		que.push(1);
		assertEquals(4,que.pop());
		assertEquals(3,que.pop());		
		assertEquals(2,que.pop());
		assertEquals(1,que.pop());
		assertEquals(-1,que.pop());
	}
}
