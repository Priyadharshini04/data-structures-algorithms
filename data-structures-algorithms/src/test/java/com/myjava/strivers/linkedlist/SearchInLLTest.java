package com.myjava.strivers.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchInLLTest {
	@Test
	public void test1()
	{
		assertEquals(1,SearchInLL.findElement(ArrayToLinkedList.conLL(new int[] {3,6,2,7,9,-1}),2));
	}
	
	@Test
	public void test2()
	{
		assertEquals(0,SearchInLL.findElement(ArrayToLinkedList.conLL(new int[] {3,6,2,7,9,-1}),4));
	}

}
