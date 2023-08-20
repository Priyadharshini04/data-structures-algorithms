package com.myjava.strivers.recursion;

public class PrintNto1 {

	public static int[] main(int n) {
		int[] arr=new int[n];
		return ntoOneArray(n, n, arr);
	}
	public static int[] ntoOneArray(int n,int size, int[] arr)
	{
		arr[n-1]=size-(n-1);
		if(n==1)
			return arr;
		return ntoOneArray(--n, size, arr);
	}
}
