package com.myjava.strivers.binarysearchtrees;

import com.myjava.strivers.binarytrees.TreeNode;

// https://www.codingninjas.com/studio/problems/ceil-from-bst_920464
public class FindCeil {
	public static int findCeil(TreeNode node, int x) {
		int maxX = -1;
		while (node != null) {
			if (node.data == x) {
				return x;
			}
			if (node.data > x) {
				if (maxX == -1)
					maxX = node.data;
				else if (maxX > node.data)
					maxX = node.data;
				node = node.left;
			} else {
				node = node.right;
			}
		}
		return maxX;

	}
}
