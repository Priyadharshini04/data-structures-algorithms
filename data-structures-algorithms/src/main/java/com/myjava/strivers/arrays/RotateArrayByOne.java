package com.myjava.strivers.arrays;
//https://www.codingninjas.com/studio/problems/left-rotate-an-array-by-one_5026278
public class RotateArrayByOne {
    static int[] rotateArray(int[] arr, int n) {
    	if(n==1)
    	{
    		return arr;
    	}
		int temp=arr[0];
    	if(n==2)
    	{
    		arr[0]=arr[1];
    		arr[1]=temp;
    		return arr;
    	}
    	int j=1;
    	for(int i=0;i<n && j<n;i++)
    	{
    		arr[i]=arr[j];
    		j++;
    	}
    	arr[n-1]=temp;
    	return arr;
    }
}
