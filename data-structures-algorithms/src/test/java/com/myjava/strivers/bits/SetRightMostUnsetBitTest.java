package com.myjava.strivers.bits;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SetRightMostUnsetBitTest {
	@Test
	public void test1()
	{
		assertEquals(5,SetRightMostUnsetBit.setBit(4));
	}
	
	@Test
	public void test2()
	{
		assertEquals(7,SetRightMostUnsetBit.setBit(7));
	}
	
	
	@Test
	public void test3()
	{
		assertEquals(11,SetRightMostUnsetBit.setBit(10));
	}
}
