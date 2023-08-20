package com.myjava.strivers.arrays;

import java.util.Scanner;

public class RotateArrayByN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int size=sc.nextInt();
//		int[] arr=new int[size];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		int rotation=sc.nextInt();
		int[] arr = rotateArray(new int[] {1,3,6,11,12,17},4);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
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
