package com.myjava.strivers.heaps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TaskSchedulerTest {
	@Test
	public void test1()
	{
		assertEquals(8,TaskScheduler.leastInterval(new char[] {'A','A','A','B','B','B'},2));
	}
	@Test
	public void test2()
	{
		assertEquals(6,TaskScheduler.leastInterval(new char[] {'A','A','A','B','B','B'},0));
	}
	@Test
	public void test3()
	{
		assertEquals(7,TaskScheduler.leastInterval(new char[] {'A','A','A','B','B','C','C'},2));
	}
}
