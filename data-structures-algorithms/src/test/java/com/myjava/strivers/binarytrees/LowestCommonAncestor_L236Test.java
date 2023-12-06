package com.myjava.strivers.binarytrees;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LowestCommonAncestor_L236Test {
	@Test
	public void test1() {
		List<TreeNode> listNode = BinaryTreeLoop
				.createBinaryTreeWithListWithChilds(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4), 1, 2, 0);
		TreeNode result = LowestCommonAncestor_L236.lowestCommonAncestor(listNode.get(0), listNode.get(1),
				listNode.get(2));
		assertEquals(listNode.get(3), result);
	}

	@Test
	public void test2() {
		List<TreeNode> listNode = BinaryTreeLoop
				.createBinaryTreeWithListWithChilds(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4), 1, 10, 1);
		TreeNode result = LowestCommonAncestor_L236.lowestCommonAncestor(listNode.get(0), listNode.get(1),
				listNode.get(2));
		assertEquals(listNode.get(3), result);
	}
}
