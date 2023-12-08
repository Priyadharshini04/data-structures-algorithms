package com.myjava.strivers.binarytrees;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AllNodesDistanceK_L863Test {
	@Test
	public void test1() {
		List<TreeNode> listNode = BinaryTreeLoop
				.createBinaryTreeWithListWithChilds(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4), 1, 1, 1);
		List<Integer> result = AllNodesDistanceK_L863.distanceK(listNode.get(0), listNode.get(3), 2);
		List<Integer> expected = Arrays.asList(7, 4, 1);
		assertTrue(expected.size() == result.size() && expected.containsAll(result) && result.containsAll(expected));
	}
}
