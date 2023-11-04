package com.myjava.strivers.binarysearchtrees;

import com.myjava.strivers.binarytrees.TreeNode;

public class FindMin {

	public static int findMin(TreeNode root) {
		TreeNode node=root;
		while(node!=null && node.left!=null)
		{
			node=node.left;
		}
		return node.data;
	}

}
