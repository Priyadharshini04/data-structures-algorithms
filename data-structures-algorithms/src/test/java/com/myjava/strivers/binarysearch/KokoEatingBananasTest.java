package com.myjava.strivers.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KokoEatingBananasTest {
	@Test
	public void test1()
	{
		assertEquals(4, KokoEatingBananas.minEatingSpeed(new int[] {3,6,7,11},8));
	}
	
	@Test
	public void test2()
	{
		assertEquals(30, KokoEatingBananas.minEatingSpeed(new int[] {30,11,23,4,20},5));
	}
	
	@Test
	public void test3()
	{
		assertEquals(2, KokoEatingBananas.minEatingSpeed(new int[] {31},30));
	}
	
	@Test
	public void test4()
	{
		assertEquals(2, KokoEatingBananas.minEatingSpeed(new int[] {312884470},312884469));
	}
	
	@Test
	public void test5()
	{
		assertEquals(14, KokoEatingBananas.minEatingSpeed(new int[] {332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184},823855818));
	}
}
