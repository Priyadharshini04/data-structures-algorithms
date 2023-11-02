package com.myjava.strivers.binarytrees;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TopViewBinaryTreeTest {
	@Test
	public void test1() {
		TreeNode root=BinaryTreeLoop.createBinaryTreeWithNull(new int[] {1,2,3,4,5,-1,6,-1,7,-1,-1,8,-1,9,-1,-1,11,10,-1,-1,-1,-1,-1});
		List<Integer> expected=Arrays.asList(10,4,2,1,3,6);
		TreeTraversalsTest.assertCollectionEquals(expected, TopViewBinaryTree.getTopView(root));
	}
}
