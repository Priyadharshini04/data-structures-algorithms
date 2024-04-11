package com.myjava.strivers.strings;

import java.text.ParseException;

import org.junit.Test;

public class SortDateStringTest {
	@Test
	public void test1() throws ParseException {
		String[] str = new String[] { "01 nov 2018", "18 sep 2016", "01 nov 2017" };
		String[] res = SortDateString.sort(str);
	}
}
