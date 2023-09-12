package com.myjava.strivers.bits;

public class SwapTwoNumbers {

	public static void swap(int[] a, int[] b) {
		a[0]=a[0]+b[0];
		b[0]=a[0]-b[0];
		a[0]=a[0]-b[0];
	}

}
