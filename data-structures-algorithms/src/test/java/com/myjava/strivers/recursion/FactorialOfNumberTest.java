package com.myjava.strivers.recursion;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FactorialOfNumberTest {
	
	@Test
	public void test1() {
		List<Long> list=new ArrayList<Long>();
		assertEquals(Arrays.asList(1L,2L,6L), FactorialOfNumber.factorialNumber(1L,7L,list,1L));
	}
}
