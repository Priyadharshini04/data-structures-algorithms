package com.myjava.strivers.binarysearchtrees;

import java.util.Arrays;
import java.util.Collections;

// https://www.codingninjas.com/studio/problems/binary-search-trees_8160443
public class IsValidBST {
	public static boolean isValidBST(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] >= arr[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
