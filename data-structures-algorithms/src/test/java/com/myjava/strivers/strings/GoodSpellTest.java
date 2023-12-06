package com.myjava.strivers.strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GoodSpellTest {
	@Test
	public void test1() {
		assertEquals(1, GoodSpell.goodSpell(8, "10321150"));
	}
}
