package com.myjava.ds.implementation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QueueArrayImplTest {
	@Test
	public void test1()
	{
		QueueArrayImpl queue=new QueueArrayImpl(5);
		assertEquals(0, queue.size());
		assertTrue(queue.isEmpty());
		queue.push(1);
		assertEquals(1, queue.peek());
		queue.push(2);
		assertEquals(1, queue.peek());
		queue.push(3);
		assertEquals(1, queue.peek());
		queue.push(4);
		assertEquals(1, queue.peek());
		assertEquals(4, queue.size());
		assertEquals(1, queue.pop());
		assertEquals(3, queue.size());
		assertEquals(2, queue.pop());
		assertEquals(2, queue.size());
		assertEquals(3, queue.pop());
		assertEquals(1, queue.size());
		assertEquals(4, queue.pop());
		assertEquals(0, queue.size());
	}
	
	@Test(expected = QueueEmptyException.class)
	public void test2()
	{
		QueueArrayImpl queue=new QueueArrayImpl(5);
		assertEquals(0, queue.size());
		assertTrue(queue.isEmpty());
		queue.peek();
	}
	
	@Test(expected = QueueFullExeption.class)
	public void test3()
	{
		QueueArrayImpl queue=new QueueArrayImpl(5);
		assertEquals(0, queue.size());
		assertTrue(queue.isEmpty());
		queue.push(1);
		assertEquals(1, queue.peek());
		queue.push(2);
		assertEquals(1, queue.peek());
		queue.push(3);
		assertEquals(1, queue.peek());
		queue.push(4);
		queue.push(5);
		assertTrue(queue.isFull());
		queue.push(6);
	}
}
