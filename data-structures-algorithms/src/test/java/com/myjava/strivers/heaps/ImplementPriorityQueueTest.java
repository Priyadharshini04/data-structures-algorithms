package com.myjava.strivers.heaps;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ImplementPriorityQueueTest {
	@Test
	public void test1() {
		List<Integer> heap = new ArrayList<Integer>();
		ImplementPriorityQueue.push(heap, 5);
		ImplementPriorityQueue.push(heap, 2);
		assertEquals(5, ImplementPriorityQueue.pop(heap));
		assertEquals(2, ImplementPriorityQueue.pop(heap));
	}
	
	@Test
	public void test2() {
		List<Integer> heap = new ArrayList<Integer>();
		ImplementPriorityQueue.push(heap, 47);
		ImplementPriorityQueue.push(heap, 32);
		ImplementPriorityQueue.push(heap, 46);
		assertEquals(47, ImplementPriorityQueue.pop(heap));
		assertEquals(46, ImplementPriorityQueue.pop(heap));
		ImplementPriorityQueue.push(heap, 99);
		ImplementPriorityQueue.push(heap, 18);
		ImplementPriorityQueue.push(heap, 79);
		assertEquals(99, ImplementPriorityQueue.pop(heap));
		assertEquals(79, ImplementPriorityQueue.pop(heap));
		assertEquals(32, ImplementPriorityQueue.pop(heap));
	}
	
	@Test
	public void test3()
	{
		List<Integer> heap=new ArrayList<Integer>();
		ImplementPriorityQueue.push(heap, 12);
		ImplementPriorityQueue.push(heap, 7);
		ImplementPriorityQueue.push(heap, 18);
		ImplementPriorityQueue.push(heap, 27);
		ImplementPriorityQueue.push(heap, 13);
		ImplementPriorityQueue.push(heap, 19);
	}
}
