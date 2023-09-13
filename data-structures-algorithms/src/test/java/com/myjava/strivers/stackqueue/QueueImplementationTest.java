package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QueueImplementationTest {
	@Test
	public void test1()
	{
		QueueImplementation.Queue que=new QueueImplementation().new Queue();
		que.enqueue(1);
		que.enqueue(3);
		que.enqueue(4);
		assertEquals(3, que.size());
		assertEquals(1, que.dequeue());
		assertEquals(3, que.dequeue());
		assertEquals(4, que.dequeue());
		assertEquals(0, que.size());
		assertEquals(-1, que.dequeue());

	}
}
