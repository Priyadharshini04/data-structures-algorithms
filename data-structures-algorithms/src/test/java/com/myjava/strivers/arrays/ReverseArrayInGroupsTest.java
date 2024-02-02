package com.myjava.strivers.arrays;

import java.util.ArrayList;

import org.junit.Test;

import com.myjava.strivers.binarytrees.TreeTraversalsTest;

public class ReverseArrayInGroupsTest {
	@Test
	public void test1() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		ReverseArrayInGroups.reverse(list, 3);
		ArrayList<Integer> exp = new ArrayList<Integer>();
		exp.add(3);
		exp.add(2);
		exp.add(1);
		exp.add(5);
		exp.add(4);
		TreeTraversalsTest.assertCollectionEquals(exp, list);
	}
}
