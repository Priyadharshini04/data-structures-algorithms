package com.myjava.strivers.bits;
// https://www.codingninjas.com/studio/problems/swap-two-numbers_1380853
public class SwapTwoNumbers {

	public static void swap(int[] a, int[] b) {
		a[0]=a[0]+b[0];
		b[0]=a[0]-b[0];
		a[0]=a[0]-b[0];
	}

}
