package com.myjava.strivers.sorting;

public class InsertionSort {

    public static void insertionSort(int[] arr, int size) {
        for(int i=0;i<size-1;i++)
        {
          int j=i;
          int key=arr[i+1];
          while(j>=0&&arr[j]>key)
          {
              arr[j+1]=arr[j];
              --j;
          }
          arr[j+1]=key;
        }
    }
}
