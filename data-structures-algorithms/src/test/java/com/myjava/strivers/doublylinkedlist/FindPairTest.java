package com.myjava.strivers.doublylinkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.*;

import org.junit.Test;

public class FindPairTest {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	@Test
	public void test1() {
		FindPair.pair(ArrayToDobulyLinkedList.constructDLLListNode(new int[] { 1, 2, 3, 4, 9 }), 5, map);
		assertEquals(2, map.size());
		Map<Integer, Integer> assertMap = new HashMap<Integer, Integer>();
		assertMap.put(1, 4);
		assertMap.put(2, 3);
		assertTrue(assertMap.equals(map));
	}
}
