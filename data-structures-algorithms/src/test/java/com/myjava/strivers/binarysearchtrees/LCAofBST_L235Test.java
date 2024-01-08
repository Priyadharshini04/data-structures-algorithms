package com.myjava.strivers.binarysearchtrees;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.myjava.strivers.binarytrees.BinaryTreeLoop;
import com.myjava.strivers.binarytrees.TreeNode;

public class LCAofBST_L235Test {
	@Test
	public void test1() {
		List<TreeNode> list = BinaryTreeLoop
				.createBinaryTreeWithListWithChilds(Arrays.asList(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5), 1, 2, 0);

		TreeNode result = LCAofBST_L235.lowestCommonAncestor(list.get(0), list.get(1), list.get(2));
		assertEquals(list.get(3), result);
	}

	@Test
	public void test2() {
		List<TreeNode> list = BinaryTreeLoop
				.createBinaryTreeWithListWithChilds(Arrays.asList(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5), 1, 4, 1);

		TreeNode result = LCAofBST_L235.lowestCommonAncestor(list.get(0), list.get(1), list.get(2));
		assertEquals(list.get(3), result);
	}
}
