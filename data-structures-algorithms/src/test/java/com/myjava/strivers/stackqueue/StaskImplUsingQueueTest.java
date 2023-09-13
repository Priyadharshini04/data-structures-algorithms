package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StaskImplUsingQueueTest {
	@Test
	public void test1() {

		StaskImplUsingQueue.MyStack obj = new StaskImplUsingQueue().new MyStack();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		assertEquals(5, obj.top());
		assertEquals(5, obj.pop());
		assertEquals(4, obj.top());

		//assertTrue(obj.empty());
	}
	
	@Test
	public void test2() {

		StaskImplUsingQueue.MyStack obj = new StaskImplUsingQueue().new MyStack();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		assertEquals(3, obj.pop());
		assertEquals(2, obj.pop());
		assertEquals(1, obj.pop());

		assertTrue(obj.empty());
	}
}
