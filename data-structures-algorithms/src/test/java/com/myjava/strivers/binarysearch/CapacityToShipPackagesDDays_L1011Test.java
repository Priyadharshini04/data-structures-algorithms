package com.myjava.strivers.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CapacityToShipPackagesDDays_L1011Test {
	@Test
	public void test1() {
		int minimumCapacity = CapacityToShipPackagesDDays_L1011
				.shipWithinDays(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 5);
		assertEquals(15, minimumCapacity);
	}

	@Test
	public void test2() {
		int minimumCapacity = CapacityToShipPackagesDDays_L1011.shipWithinDays(new int[] { 3, 2, 2, 4, 1, 4 }, 3);
		assertEquals(6, minimumCapacity);
	}

	@Test
	public void test3() {
		int minimumCapacity = CapacityToShipPackagesDDays_L1011.shipWithinDays(new int[] { 1, 2, 3, 1, 1 }, 4);
		assertEquals(3, minimumCapacity);
	}
}
