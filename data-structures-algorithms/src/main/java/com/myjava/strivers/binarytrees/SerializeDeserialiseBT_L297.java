package com.myjava.strivers.binarytrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SerializeDeserialiseBT_L297 {

	public static TreeNode deserialise(String resultSer) {
		if(resultSer==null || resultSer.isBlank())
		{
			return null;
		}
		TreeNode root = null;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		String[] chs = resultSer.split(",");
//		for (int i = 0; i < resultSer.length(); i++) {
//			if (resultSer.charAt(i) != ',') {
//				if (resultSer.charAt(i) == '-') {
//					String ch = resultSer.substring(i, i++ + 2);
//					chs.add(ch);
//				} else
//					chs.add(String.valueOf(resultSer.charAt(i)));
//			}
//		}
		if (chs.length > 0 && root == null && !chs[0].equals("#")) {
			root = new TreeNode(Integer.parseInt(chs[0]));
			queue.offer(root);
		}
		int i = 0;
		while (i < (chs.length / 2) - 1 && !queue.isEmpty()) {
			int left = (2 * i) + 1;
			int right = (2 * i) + 2;
			TreeNode node = queue.poll();
			if (left < chs.length && !chs[left].equals("#")) {
				node.left = new TreeNode(Integer.parseInt(chs[left]));
				queue.offer(node.left);
			}
			if (left < chs.length && !chs[right].equals("#")) {
				node.right = new TreeNode(Integer.parseInt(chs[right]));
				queue.offer(node.right);
			}
			i++;
		}
		return root;
	}

	public static String serialize(TreeNode root) {
		StringBuilder resultB = new StringBuilder();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		if (root != null) {
			q.offer(root);
			resultB.append(root.data + ",");
		}
		while (!q.isEmpty()) {
			int level = q.size();
			while (level-- > 0) {
				TreeNode node = q.poll();
				if (node.left != null) {
					resultB.append(node.left.data + ",");
					q.offer(node.left);
				} else {
					resultB.append("#,");
				}
				if (node.right != null) {
					resultB.append(node.right.data + ",");
					q.offer(node.right);
				} else {
					resultB.append("#,");
				}
			}
		}
		return resultB.length() > 1 ? resultB.substring(0, resultB.length() - 1) : String.valueOf(resultB);
	}

}
