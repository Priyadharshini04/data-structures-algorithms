package com.myjava.strivers.recursion;

public class ReverseAnArray {

	//https://www.codingninjas.com/studio/problems/reverse-an-array_8365444
	public static int[] reverseArray(int n,int[] arr, int start)
	{
		if(start>=n)
			return arr;
		int a=arr[start];
		arr[start]=arr[n-1];
		arr[n-1]=a;
		return reverseArray(--n,arr,++start);
	}
}