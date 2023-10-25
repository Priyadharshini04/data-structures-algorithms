package com.myjava.strivers.binarytrees;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-postorder-traversal/description/
public class PostOrderTraverse {

	public static List<Integer> postOrderTraverse(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		postOrderTraverse(root, list);
		return list;
	}

	private static void postOrderTraverse(TreeNode root, List<Integer> list) {
		if(root!=null)
		{
			postOrderTraverse(root.left,list);
			postOrderTraverse(root.right,list);
			list.add(root.data);
		}
	}

}
