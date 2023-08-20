package com.myjava.strivers.recursion;

public class Fibonnacci {
	// https://www.codingninjas.com/studio/problems/print-fibonacci-series_7421617
	public static int[] fibSeries(int n)
	{
	int arr[]=new int[n];
    if(n==1)
    return arr;
    return fibNocciSeries(1,arr,0,1);
	}
    public static int[] fibNocciSeries(int start,int[] arr,int a, int b)
	{
		if(start>=arr.length)
			return arr;
		arr[start]=b;
		int c=a;
		a=b;
		b=c+a;
		return fibNocciSeries(++start, arr, a, b);
	}
}
