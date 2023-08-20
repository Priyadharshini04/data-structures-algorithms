package com.myjava.strivers.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchInsertTest {
	@Test
	public void main() {
		assertEquals(4, SearchInsert.searchInsert(new int[] {1,3,5,6,8}, 0, 7));
	}
}
