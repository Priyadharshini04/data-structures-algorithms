package com.myjava.strivers.binarytrees;

import java.util.ArrayList;
import java.util.List;

public class MorrisTraversals {
	public static List<Integer> inOrder(TreeNode node)
	{
		List<Integer> list=new ArrayList<Integer>();
		TreeNode curr=node;
		while(curr!=null) {
			if(curr.left==null)
			{
				list.add(curr.data);
				curr=curr.right;
			}
			else {
				TreeNode prev=curr.left;
				while(prev.right!=null && prev.right!=curr)
				{
					prev=prev.right;
				}
				if(prev.right==null)
				{
					prev.right=curr;
					curr=curr.left;
				}
				else {
					prev.right=null;
					list.add(curr.data);
					curr=curr.right;
				}
			}
		}
		return list;
	}
}
