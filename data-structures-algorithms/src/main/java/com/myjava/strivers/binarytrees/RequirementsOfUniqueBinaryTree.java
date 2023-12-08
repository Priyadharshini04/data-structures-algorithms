package com.myjava.strivers.binarytrees;

// https://www.codingninjas.com/studio/problems/unique-binary-tree_8180906
public class RequirementsOfUniqueBinaryTree {

	public static boolean uniqueBinaryTree(int a, int b) {
		if (a != b) {
			if (a == 2 || b == 2) {
				return true;
			}
		}
		return false;
	}

}
