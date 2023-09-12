package com.myjava.strivers.bits;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class KthBitSetTest {
	@Test
	public void test1() {
		assertFalse(KthBitSet.isKthBitSet(128, 7));
	}
}
