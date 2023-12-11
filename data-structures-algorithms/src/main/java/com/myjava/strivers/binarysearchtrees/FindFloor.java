package com.myjava.strivers.binarysearchtrees;

import com.myjava.strivers.binarytrees.TreeNode;

public class FindFloor {

	public static int findFloor(TreeNode root, int x) {
		int minX = -1;
		while (root != null) {
			if (root.data == x) {
				return x;
			}
			if (root.data < x) {
				if (minX == -1)
					minX = root.data;
				else if (minX < root.data)
					minX = root.data;
				root = root.right;
			} else {
				root = root.left;
			}
		}
		return minX;
	}

}
