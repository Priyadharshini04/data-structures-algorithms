package com.myjava.strivers.sorting;

import java.util.Arrays;

public class InsertionSortRevise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = insert(new int[]{2,13, 4,1,3,6,28});
		System.out.println(Arrays.toString(arr));
	}
	public static int[] inserts(int[] arr)
	{
		int i=0;
		while(i<arr.length-1)
		{
			int j=i;
			int key=arr[i+1];
			while(j>=0 && key<arr[j])
			{
					arr[j+1]=arr[j];
					j--;
			}
			arr[j+1]=key;
			i++;
		}
		return arr;
	}
	
	public static int[] insert(int[] arr)
	{
		int i=0;
		while(i<arr.length-1)
		{
			int key=arr[i+1];
			int j=i;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			i++;
		}
		return arr;
	}
}
