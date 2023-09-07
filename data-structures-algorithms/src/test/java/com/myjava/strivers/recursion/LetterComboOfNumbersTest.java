package com.myjava.strivers.recursion;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LetterComboOfNumbersTest {
	@Test
	public void test1() {
		List<String> list1 = Arrays.asList("adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi", "bdg", "bdh",
				"bdi", "beg", "beh", "bei", "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg", "ceh", "cei", "cfg", "cfh",
				"cfi");
		List<String> list2 = LetterComboOfNumbers.findCombos("234");
		assertTrue(list1.size() == list2.size() && list1.containsAll(list2) && list2.containsAll(list1));
	}
	
	@Test
	public void test2() {
		List<String> list1 = Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf");
		List<String> list2 = LetterComboOfNumbers.findCombos("23");
		assertTrue(list1.size() == list2.size() && list1.containsAll(list2) && list2.containsAll(list1));
	}
	
	@Test
	public void test3() {
		List<String> list1 = Arrays.asList();
		List<String> list2 = LetterComboOfNumbers.findCombos("");
		assertTrue(list1.size() == list2.size() && list1.containsAll(list2) && list2.containsAll(list1));
	}
}
