package com.myjava.strivers.recursion;

public class Print1ToN {

	public int[] print1ToN(int n) {
		int arr[] = new int[n];
		return oneToNArray(n,arr);
	}
	public static int[] oneToNArray(int n, int[] arr)
	{
		arr[n-1]=n;
		if(n==1)
		{
			return arr;
		}
		return oneToNArray(--n,arr);
	}
}
