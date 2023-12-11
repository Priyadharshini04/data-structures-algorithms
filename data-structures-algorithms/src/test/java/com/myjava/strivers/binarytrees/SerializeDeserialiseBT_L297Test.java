package com.myjava.strivers.binarytrees;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class SerializeDeserialiseBT_L297Test {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(1, 2, 3, null, null, 4, 5));
		String resultSer = SerializeDeserialiseBT_L297.serialize(root);
		assertEquals("1,2,3,#,#,4,5,#,#,#,#", resultSer);
		assertTreeNodeEquals(root, SerializeDeserialiseBT_L297.deserialise(resultSer));
	}

	@Test
	public void test2() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(4, -7, -3, null, null, -9, -3, 9, -7, -4,
				null, 6, null, -6, -6, null, null, 0, 6, 5, null, 9, null, null, -1, -4, null, null, null, -2));
		String resultSer = SerializeDeserialiseBT_L297.serialize(root);
		assertEquals("4,-7,-3,#,#,-9,-3,9,-7,-4,#,6,#,-6,-6,#,#,0,6,5,#,9,#,#,-1,-4,#,#,#,-2,#,#,#,#,#,#,#", resultSer);
		assertTreeNodeEquals(root, SerializeDeserialiseBT_L297.deserialise(resultSer));
	}

	@Test
	public void test3() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(1, 2, -13, null, null, 4, 5));
		String resultSer = SerializeDeserialiseBT_L297.serialize(root);
		assertEquals("1,2,-13,#,#,4,5,#,#,#,#", resultSer);
		assertTreeNodeEquals(root, SerializeDeserialiseBT_L297.deserialise(resultSer));
	}

	@Test
	public void test4() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList());
		String resultSer = SerializeDeserialiseBT_L297.serialize(root);
		assertEquals("", resultSer);
		assertTreeNodeEquals(root, SerializeDeserialiseBT_L297.deserialise(resultSer));
	}

	public void assertTreeNodeEquals(TreeNode root, TreeNode result) {
		if (root == null) {
			assertNull(result);
		}
		Queue<TreeNode> q1 = new LinkedList<TreeNode>();
		Queue<TreeNode> q2 = new LinkedList<TreeNode>();

		if (root != null) {
			q1.offer(root);
			q2.offer(result);
		}
		while (!q1.isEmpty() || !q2.isEmpty()) {
			int level = q1.size();
			assertEquals(level, q2.size());
			while (level-- > 0) {
				TreeNode node = q1.poll();
				TreeNode node2 = q2.poll();

				assertEquals(node.data, node2.data);
				if (node.left != null) {
					q1.offer(node.left);
					q2.offer(node2.left);
				}
				if (node.right != null) {
					q1.offer(node.right);
					q2.offer(node2.right);
				}
			}
		}
	}
}
