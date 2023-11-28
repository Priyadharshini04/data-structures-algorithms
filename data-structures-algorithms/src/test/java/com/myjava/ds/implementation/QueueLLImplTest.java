package com.myjava.ds.implementation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QueueLLImplTest {
	@Test
	public void test1() {
		QueueLLImpl queue = new QueueLLImpl();
		assertTrue(queue.isEmpty());
		assertEquals(0, queue.size());
		queue.push(1);
		assertEquals(1, queue.peek());
		queue.push(2);
		assertEquals(1, queue.peek());
		queue.push(3);
		assertEquals(1, queue.peek());
		queue.push(4);
		assertEquals(1, queue.peek());
		queue.push(5);
		assertEquals(1, queue.peek());
		assertEquals(5, queue.size());
		assertFalse(queue.isEmpty());
		assertEquals(1, queue.pop());
		assertEquals(4, queue.size());
		assertEquals(2, queue.pop());
		assertEquals(3, queue.size());
		assertEquals(3, queue.pop());
		assertEquals(2, queue.size());
		assertEquals(4, queue.pop());
		assertEquals(1, queue.size());
		assertEquals(5, queue.pop());
		assertEquals(0, queue.size());
		assertTrue(queue.isEmpty());
	}
}
