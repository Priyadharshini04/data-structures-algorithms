package com.myjava.strivers.binarytrees;

import java.util.Arrays;

import org.junit.Test;

public class FlattenBT_L114Test {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(1, 2, 5, 3, 4, null, 6));
		TreeNode expected = BinaryTreeLoop
				.createBinaryTreeWithList(Arrays.asList(1, null, 2, null, 3, null, 4, null, 5, null, 6));
		FlattenBT_L114.flatten(root);
		new SerializeDeserialiseBT_L297Test().assertTreeNodeEquals(expected, root);
	}
}
