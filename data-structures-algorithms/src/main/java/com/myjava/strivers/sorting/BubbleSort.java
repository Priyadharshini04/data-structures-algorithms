package com.myjava.strivers.sorting;


public class BubbleSort {

	public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        for(int i=0;i<n;i++)
        {
            boolean swapped=false;
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
    }
	
	
}
