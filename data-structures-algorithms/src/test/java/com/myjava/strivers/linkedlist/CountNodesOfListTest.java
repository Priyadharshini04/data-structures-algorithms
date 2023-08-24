package com.myjava.strivers.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountNodesOfListTest {

	@Test
	public void test1()
	{
		assertEquals(4, CountNodesOfList.count(ArrayToLinkedList.conLL(new int[] {5,4,12,7})));
	}
}
