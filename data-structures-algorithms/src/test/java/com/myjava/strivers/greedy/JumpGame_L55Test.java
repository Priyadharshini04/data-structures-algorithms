package com.myjava.strivers.greedy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JumpGame_L55Test {
	@Test
	public void test1()
	{
		assertTrue(JumpGame_L55.canJump(new int[] {2,3,1,1,4}));
	}
	
	@Test
	public void test2()
	{
		assertFalse(JumpGame_L55.canJump(new int[] {3,2,1,0,4}));
	}
	
	@Test
	public void test3()
	{
		assertTrue(JumpGame_L55.canJump(new int[] {3,2,5,0,4}));
	}
	
	@Test
	public void test4()
	{
		assertFalse(JumpGame_L55.canJump(new int[] {0,5,5,0,4}));
	}
	
	@Test
	public void test5()
	{
		assertTrue(JumpGame_L55.canJump(new int[] {1,1,1,1,0}));
	}
	
	@Test
	public void test6()
	{
		assertFalse(JumpGame_L55.canJump(new int[] {1,1,1,0,1}));
	}
	
	@Test
	public void test7()
	{
		assertFalse(JumpGame_L55.canJump(new int[] {1,0,1,0}));
	}
}
