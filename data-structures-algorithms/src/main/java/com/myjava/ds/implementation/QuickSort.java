package com.myjava.ds.implementation;

public class QuickSort {
	public static void sort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	// right pivot index.
	private static void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int idx = start;
			int i = start;
			while (i < end) {
				if (arr[i] <= arr[end]) {
					int temp = arr[i];
					arr[i] = arr[start];
					arr[start++] = temp;
				}
				i++;
			}
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			quickSort(arr, idx, start - 1);
			quickSort(arr, start+1, end);
		}
	}

	// left pivot index.
	private static void quickSortLeft(int[] arr, int start, int end) {
		if (start < end) {
			int idx=end;
			int i=end;
			while(i>start)
			{
				if(arr[i]>arr[start])
				{
					int temp=arr[i];
					arr[i]=arr[end];
					arr[end--]=temp;
				}
				i--;
			}
			int temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			int mid=(start)+(idx-end)/2;
			if(arr[mid]>arr[start])
			{
				mid=start;
			}
			if(arr[mid]>end)
			{
				mid=end;
			}
			quickSortLeft(arr, start, mid-1);
			quickSortLeft(arr, mid+1, idx);
		}
	}
}
