package com.myjava.strivers.arrays;

public class RotateArrayByOne {
	public static void main(String[] args)
	{
		
	}
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
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
