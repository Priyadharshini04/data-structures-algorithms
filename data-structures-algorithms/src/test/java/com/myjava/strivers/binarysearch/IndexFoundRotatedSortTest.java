package com.myjava.strivers.binarysearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class IndexFoundRotatedSortTest {
	
	@Test
	public void test1()
	{
		assertTrue(IndexFoundRotatedSort.search(new int[] {2,5,6,0,0,1,2}, 0));
	}
	
	@Test
	public void test2()
	{
		assertTrue(IndexFoundRotatedSort.search(new int[] {1,0,1,1,1}, 0));
	}
	
	@Test
	public void test3()
	{
		assertTrue(IndexFoundRotatedSort.search(new int[] {2,5,6,0,0,1,2}, 0));
	}
	
	@Test
	public void test4()
	{
		assertFalse(IndexFoundRotatedSort.search(new int[] {2,5,6,0,0,1,2}, 3));
	}
	
	@Test
	public void test5()
	{
		assertTrue(IndexFoundRotatedSort.search(new int[] {3,1,1}, 3));
	}
	
	@Test
	public void test6()
	{
		assertTrue(IndexFoundRotatedSort.search(new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1}, 2));
	}
	
	@Test
	public void test7()
	{
		assertTrue(IndexFoundRotatedSort.search(new int[] {1}, 1));
	}
}
