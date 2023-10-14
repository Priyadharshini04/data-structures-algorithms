package com.myjava.strivers.heaps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinHeapTest {
	
	@Test
	public void test1()
	{
		MinHeap minheap=new MinHeap(0);
		minheap.insert(2);
		minheap.insert(1);
		assertEquals(1, minheap.extractMinElement());
	}
	
	@Test
	public void test2()
	{
		MinHeap minheap=new MinHeap(0);
		minheap.insert(5);
		minheap.insert(43);
		minheap.insert(15);
		minheap.deleteElement(2);
		assertEquals(5, minheap.extractMinElement());
	}
	
	@Test
	public void test3()
	{
		MinHeap minheap=new MinHeap(0);
		minheap.insert(5);
		minheap.insert(43);
		assertEquals(5, minheap.extractMinElement());
		minheap.deleteElement(2);
		assertEquals(43, minheap.extractMinElement());
	}
}
