package com.myjava.strivers.sorting;


public class QuickSort {

	public static void sortQuick(int[] oldarr, int i, int j) {
		if(i<j)
		{
			int pi=partition(oldarr,i,j);
			sortQuick(oldarr, i, pi-1);
			sortQuick(oldarr, pi+1, j);
			
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int start=low;
		for(int i=low;i<high;i++)
		{
			if(arr[i]<=arr[high] && i!=high )
			{
				int temp=arr[start];
				arr[start]=arr[i];
				arr[i]=temp;
				start++;
			}
		}
		int temp=arr[start];
		arr[start]=arr[high];
		arr[high]=temp;
		return start;
	}

}
