package com.myjava.strivers.recursion;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GenerateSubSequenceTest {
	@Test
	public void test1() {
		List<String> list = GenerateSubSequence.generateSubsequences("cn");
		List<String> exp = Arrays.asList("", "cn", "c", "n");
		assertTrue(list.size() == exp.size() && list.containsAll(exp) && exp.containsAll(list));
	}
}
