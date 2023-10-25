package com.myjava.strivers.binarytrees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreOrderTraversal_L144 {

	public static List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> preOrderList = new ArrayList<Integer>();
		preOrder(root, preOrderList);
		return preOrderList;
	}

	private static void preOrder(TreeNode root, List<Integer> preOrderList) {
		if (root != null) {
			preOrderList.add(root.data);
			preOrder(root.left, preOrderList);
			preOrder(root.right, preOrderList);
		}

	}

}
