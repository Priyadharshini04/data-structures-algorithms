package com.myjava.strivers.graph;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOfProvinces_L547Test {
	@Test
	public void test1() {
		int[][] isConnected = new int[][] { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		assertEquals(2, NumberOfProvinces_L547.findCircleNum(isConnected));

	}
}
