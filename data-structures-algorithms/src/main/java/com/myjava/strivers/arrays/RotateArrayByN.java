package com.myjava.strivers.arrays;

public class RotateArrayByN {

	static int[] rotateArray(int[] arr,int rotateN)
	{
		if(arr.length==1)
		{
			return arr;
		}
		if(arr.length==2 && rotateN==1)
		{
			int temp=arr[0];
			arr[0]=arr[1];
			arr[1]=temp;
			return arr;
		}
		int[] newarr=new int[rotateN];
		for(int i=0;i<newarr.length;i++)
		{
			newarr[i]=arr[i];
		}
		int k=rotateN;
		int j=0;
		for(j=0;j<arr.length&&k<arr.length;j++)
		{
			arr[j]=arr[k];
			k++;
		}
		for(int l=0;l<newarr.length;l++)
		{
			arr[j]=newarr[l];
			j++;
		}
		return arr;
	}
}
