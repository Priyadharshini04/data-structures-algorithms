package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeastRecentlyUsedCache_L146Test {
	@Test
	public void test1() {
		LeastRecentlyUsedCache_L146 lRUCache = new LeastRecentlyUsedCache_L146(2);
		lRUCache.put(1, 1); // cache is {1=1}
		lRUCache.put(2, 2); // cache is {1=1, 2=2}
		assertEquals(1, lRUCache.get(1)); // return 1
		lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		assertEquals(-1, lRUCache.get(2)); // returns -1 (not found)
		lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
		assertEquals(-1, lRUCache.get(1)); // return -1 (not found)
		assertEquals(3, lRUCache.get(3)); // return 3
		assertEquals(4, lRUCache.get(4)); // return 4
	}

	@Test
	public void test2() {
		LeastRecentlyUsedCache_L146 lRUCache = new LeastRecentlyUsedCache_L146(3);
		lRUCache.put(1, 1); // cache is {1=1}
		lRUCache.put(2, 2); // cache is {1=1, 2=2}
		lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		assertEquals(1, lRUCache.get(1)); // return 1
		assertEquals(2, lRUCache.get(2)); // returns -1 (not found)
		lRUCache.put(4, 4); // LRU key was 1, evicts key 3, cache is {4=4, 3=3}
		assertEquals(-1, lRUCache.get(3)); // return -1 (not found)
	}

	@Test
	public void test3() {
		LeastRecentlyUsedCache_L146 lRUCache = new LeastRecentlyUsedCache_L146(1);
		lRUCache.put(2, 1); // cache is {1=1}
		assertEquals(1, lRUCache.get(2)); // cache is {1=1, 2=2}
		lRUCache.put(3, 2); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		assertEquals(2, lRUCache.get(3)); // return 1
		assertEquals(2, lRUCache.get(3)); // returns -1 (not found)
	}

	@Test
	public void test4() {
		LeastRecentlyUsedCache_L146 lRUCache = new LeastRecentlyUsedCache_L146(2);
		assertEquals(-1, lRUCache.get(2)); // returns -1 (not found)
		lRUCache.put(2, 6); // cache is {1=1, 2=2}
		assertEquals(-1, lRUCache.get(1)); // return 1
		lRUCache.put(1, 5); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		lRUCache.put(1, 2); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
		assertEquals(2, lRUCache.get(1)); // return -1 (not found)
		assertEquals(6, lRUCache.get(2)); // return 3
	}

	@Test
	public void test5() {
		LeastRecentlyUsedCache_L146 lRUCache = new LeastRecentlyUsedCache_L146(3);
		lRUCache.put(1, 1); // cache is {1=1}
		lRUCache.put(2, 2); // cache is {1=1, 2=2}
		lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		lRUCache.put(4, 4); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		assertEquals(4, lRUCache.get(4)); // return 1
		assertEquals(3, lRUCache.get(3)); // returns -1 (not found)
		assertEquals(2, lRUCache.get(2)); // returns -1 (not found)
		assertEquals(-1, lRUCache.get(1)); // returns -1 (not found)

		lRUCache.put(5, 5); // LRU key was 1, evicts key 3, cache is {4=4, 3=3}
		assertEquals(-1, lRUCache.get(1)); // return -1 (not found)
		assertEquals(2, lRUCache.get(2)); // returns -1 (not found)
		assertEquals(3, lRUCache.get(3)); // returns -1 (not found)
		assertEquals(-1, lRUCache.get(4)); // returns -1 (not found)
		assertEquals(5, lRUCache.get(5)); // returns -1 (not found)

	}
}
