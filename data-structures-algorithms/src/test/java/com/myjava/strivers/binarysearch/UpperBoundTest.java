package com.myjava.strivers.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UpperBoundTest {

	@Test
	public void main() {
		assertEquals(5,UpperBound.upperBound(new int[] {1,2,5,6,10}, 0, 10));
	}
}
