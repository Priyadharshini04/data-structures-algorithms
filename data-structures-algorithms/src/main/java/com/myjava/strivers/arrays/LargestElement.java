package com.myjava.strivers.arrays;
//https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279
public class LargestElement {


    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int max=arr[0];
        if(arr.length==1)
        {
            return n;
        }
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;

    }
}
