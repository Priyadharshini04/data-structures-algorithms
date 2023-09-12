package com.myjava.strivers.bits;
// https://www.codingninjas.com/studio/problems/check-whether-k-th-bit-is-set-or-not_5026446
public class KthBitSet {

	public static boolean isKthBitSet(int n, int k) {
		int a=n>>(k-1);
		return (a^(a-1))==1;
	}

}
