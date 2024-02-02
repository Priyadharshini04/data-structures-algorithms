package com.myjava.strivers.binarysearchtrees;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.myjava.strivers.binarytrees.CreateBinaryTree;
import com.myjava.strivers.binarytrees.TreeNode;

public class PredecessorSuccessorTest {
	@Test
	public void test1() {
		TreeNode root = CreateBinaryTree.createBinaryTree(new int[] { 15, 10, 20, 8, 12, 16, 25 });
		List<Integer> result = PredecessorSuccessor.predecessorSuccessor(root, 10);
		List<Integer> expected = Arrays.asList(8, 12);

		assertTrue(result.size() == expected.size() && result.containsAll(expected) && expected.containsAll(result));
	}

	@Test
	public void test2() {
		TreeNode root = CreateBinaryTree.createBinaryTree(new int[] { 10, 5 });
		List<Integer> result = PredecessorSuccessor.predecessorSuccessor(root, 5);
		List<Integer> expected = Arrays.asList(-1, 10);

		assertTrue(result.size() == expected.size() && result.containsAll(expected) && expected.containsAll(result));
	}

	@Test
	public void test3() {
		TreeNode root = CreateBinaryTree.createBinaryTree(new int[] { 6521171, 5650934, 9278816, 899375, -1, 8989449 });
		List<Integer> result = PredecessorSuccessor.predecessorSuccessor(root, 9615950);
		List<Integer> expected = Arrays.asList(9278816, -1);

		assertTrue(result.size() == expected.size() && result.containsAll(expected) && expected.containsAll(result));
	}

	@Test
	public void test4() {
		TreeNode root = CreateBinaryTree.createBinaryTree(new int[] { 9731081, 7618702, 9962232, 2512657 });
		List<Integer> result = PredecessorSuccessor.predecessorSuccessor(root, 4950885);
		List<Integer> expected = Arrays.asList(2512657, 7618702);

		assertTrue(result.size() == expected.size() && result.containsAll(expected) && expected.containsAll(result));
	}

	@Test
	public void test5() {
		TreeNode root = CreateBinaryTree.createBinaryTree(new int[] { 4566578, 4361809, 7348908, 1292970 });
		List<Integer> result = PredecessorSuccessor.predecessorSuccessor(root, 486169);
		List<Integer> expected = Arrays.asList(-1, 1292970);

		assertTrue(result.size() == expected.size() && result.containsAll(expected) && expected.containsAll(result));
	}

	@Test
	public void test6() {
		TreeNode root = CreateBinaryTree.createBinaryTree(new int[] { 4851431, 2267178, 8685515 });
		List<Integer> result = PredecessorSuccessor.predecessorSuccessor(root, 6001049);
		List<Integer> expected = Arrays.asList(4851431, 8685515);

		assertTrue(result.size() == expected.size() && result.containsAll(expected) && expected.containsAll(result));
	}
}
